package com.melonlink.cxxt.GETutil;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {
	public static String getcurrentIP() {//获取当前主机IP
        InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        String ip=addr.getHostAddress().toString(); //获取本机ip  
        //String hostName=addr.getHostName().toString(); //获取本机计算机名称  
        System.out.println(ip);
        //System.out.println(hostName);
        return ip;
   }
	
}
