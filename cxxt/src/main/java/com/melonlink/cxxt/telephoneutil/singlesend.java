package com.melonlink.cxxt.telephoneutil;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;

import net.sf.json.JSONObject;


public class singlesend{
    public static String URL="http://api01.monyun.cn:7901/sms/v2/std/single_send";
	StringRandom Random=new StringRandom();
	public static boolean isMobileNO(String mobile){ 
		Pattern p=null;
        Matcher m=null;
        boolean b=false; 
	    p=Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9])|(17[0-9]))\\d{8}$");  
		m=p.matcher(mobile);
        b=m.matches(); 
        return b;
	}	
	@SuppressWarnings("unchecked")
	public String Send(String mobile) throws UnsupportedEncodingException {
        JSONObject jsobj1 = new JSONObject();
        String random=Random.getStringRandom();
        jsobj1.put("apikey", "695a88473c49a782c56c46cf56cf2dfc");
        jsobj1.put("mobile", mobile);
        String decode=URLEncoder.encode("亲爱的同学，欢迎进入电信学院创新实验室学习，你所注册的账号验证码为:"+random+"。","GBK");
        jsobj1.put("content",decode);
        post(jsobj1);
        return random;
    }
    public static String post(JSONObject json) {
        HttpClient client=new DefaultHttpClient();
        HttpPost post=new HttpPost(URL);
        post.setHeader("Content-Type","application/json");
        post.addHeader("Authorization","Basic YWRtaW46");
        String result="";
        try {
            StringEntity s=new StringEntity(json.toString(),"utf-8");
            s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,"application/json"));
            post.setEntity(s);
            HttpResponse httpResponse = client.execute(post);
            InputStream inStream = httpResponse.getEntity().getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inStream, "utf-8"));
            StringBuilder strber = new StringBuilder();
            String line=null;
            while ((line=reader.readLine())!=null)
            strber.append(line+"\n");
            inStream.close();
            result=strber.toString();
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            	  System.out.println("发送成功！");
            } else {
                System.out.println("发送失败！");
            }
        } catch (Exception e) {
            System.out.println("出现异常！");
            throw new RuntimeException(e);
        }
        return result;
    }
}