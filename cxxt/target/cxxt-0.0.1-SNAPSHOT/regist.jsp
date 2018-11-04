   <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags" %>    
<%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--声明文档的兼容模式，表示使用IE浏览器的最新模式-->
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <!--设置窗口宽度（值为设置的理想宽度），页面初始缩放值<理想宽度/可见宽度>-->
    <title>注册</title>
    <link rel="stylesheet" href="css/register.css" type="text/css"/>
   <script type="text/javascript" src="js/jquery-1.11.3.min.js" ></script>
    <script type="text/javascript" src="js/bootstrap.min.js" ></script>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="js/校验.js"></script>
    <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.10.0/jquery.validate.min.js"></script>
     <!-- 验证码切换 -->
<script type="text/javascript">
	//function changeValidateCode(obj) {
		//获取当前的时间作为参数，无具体意义    
		//var timenow = new Date().getTime();
		//每次请求需要一个不同的参数，否则可能会返回同样的验证码    
		//这和浏览器的缓存机制有关系，也可以把页面设置为不缓存，这样就不用这个参数了。    
		//obj.src = "rand.action?d=" + timenow;
		/* alert(timenow); */
	// 在被嵌套时就刷新上级窗口
	//if(window.parent != window){
		//window.parent.location.reload(true);
	//}
	//}   
	 $(document).ready(function() {
			$('#err_form').submit(function() {
				 var username=$("#username").val();
				  	var password=$("#password").val();
				  var telephone = $("#telephone").val();
				  var mail = $("#mail").val();
				     var params = {
				           "username":username,
				           "password":password,
				           "mail":mail,
				           "telephone":telephone
				       };
				$.ajax({
					type:"post",
		            async:true,
		            url: "${pageContext.request.contextPath}/user_zhuce",       
		            data: params,           
		            dataType:"text",
		            success:function(){
		                alert("发送成功");
		            }
				});
					return false;	//还是要return false, 跟上面一样的道理
			});
		});
</script>    
</head>
<body>
<div id="logo" class="container-fluid col-lg-12 col-md-12 col-sm-12 hidden-xs">
    <img src="img/logo.gif" style="height:61px;" />
</div>
<div class="container-fluid" >
    <div class="row">
        <div class="col-lg-12  col-md-12 col-sm-6 col-xs-12" >
          <div id="regist">
              <div id="top-one">
                  <h1 >&nbsp;&nbsp;&nbsp;注 &nbsp;  册</h1>
                  <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font  size="3px" face="华文楷体" color="black">人生在勤，不索何获</font></span>
                  <span style="float: right; "><a href="login.jsp">已有账号，立即登录</a></span><br/>
              </div>

              <!--注册部分-->
              <div id="top-three">
                <form id="err_form"> 
                <!-- <form  action="${pageContext.request.contextPath}/user/user_zhuce.action" method="post">-->
                    <tr>
                        <td colspan="2">
                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;用户名：<input  name="username" id="username"    maxlength="12" onfocus="showTips()"   />
                        <span id="namespan"></span><br/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 密码： <input type="password" name="password"  id="password"   onfocus="showTips()"   />
                            <span id="pspan"></span><br/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            &nbsp;&nbsp; 确认密码： <input type="password"  name="repassword"  id="repassword"  onfocus="showTips()"  />
                            <span id="respan" style="text-align: center"></span><br/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email：<input name="mail"   id="mail"   onfocus="showTips()"  />
                            <span id="mspan" style="text-align: center"></span><br/>
                        </td>
                    </tr>

                    <tr>
                        <td colspan="2">
                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;手机号：<input  name="telephone"  id="telephone"   maxlength="11" onfocus="showTips()"  />
                            <span id="telespan" style="text-align: center"></span>
                            <input type="submit" id="sub" value="发送验证码"/>
                            <br/>
                        </td>
                    </tr>
                </form>
                <form  action="${pageContext.request.contextPath}/user_SaveUser" method="post">
                        <td colspan="2">
                            &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;验证码：<input  name="verificationde"  id="verificationde"   maxlength="11" onfocus="showTips()"  />
                            <span id="telespan" style="text-align: center"></span><br/>
                          </td>
                          <TR>
                             <TD style="HEIGHT: 18px" colspan="2" ><font color="red" ><s:property value="exception.message" /> </font></TD>
                             <TD style="HEIGHT: 18px"></TD>
                          </TR>
                    <tr>
                        <td colspan="2">
                            <input type="submit"   id="btn" value="同意协议并注册"  />
                        </td>
                    </tr>
                    </form>
              </div>
          </div>
</div>
</div>
</div>
<!--页尾-->
<div id="footer"  class="container-fluid  col-lg-12 col-md-12 hidden-sm hidden-xs"  >
    <div id="yw">
        <span><a href="#"> 关于创新学堂 |  <a href="#"> 联系我们</a> |<a href="#"> 帮助中心</a>|Coyright @2018   创新课堂网络505  版权所有</span></div>
</div>
</body>
</html>