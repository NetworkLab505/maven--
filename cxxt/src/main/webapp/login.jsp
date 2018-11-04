<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
%>
<%@ taglib prefix="s"  uri="/struts-tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--声明文档的兼容模式，表示使用IE浏览器的最新模式-->
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <!--设置窗口宽度（值为设置的理想宽度），页面初始缩放值<理想宽度/可见宽度>-->
<title>登录</title>
    <link rel="stylesheet" href="css/register.css" type="text/css"/>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="js/jquery-1.11.3.min.js" ></script>
    <script type="text/javascript" src="js/bootstrap.min.js" ></script>
</head>
<body>
<div id="logo" class="container-fluid">
    <img src="img/logo.gif" style="height: 80px;" />
</div>
<div class="container-fluid">

    <div class="row">
        <div class="col-lg-12 col-md-12 col-xs-6 colo-sm-6">
                <div id="regist">
                    <div id="top-one">
                        <h1>&nbsp;&nbsp;&nbsp;登 &nbsp;  录</h1>
                        <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font  size="4px" face="华文楷体" color="black">没有松柏恒，难得雪中青</font></span>
                    </div>
                    <div id="top-two">
                        <div id="m0">&nbsp;&nbsp;&nbsp;&nbsp;<font size="4px" color="black">使用第三方账户直接登录</font></div>
                        <div id="m1">
                            <a href="#"> <img  src="img/logo7.jpg" style="width:62px; height:68px"/></a>
                            <a href="#"><img  src="img/logo8.jpg" style="width:62px; height:61px"/></a>
                            <a href="#"><img  src="img/logo9.jpg" style="width:70px; height:68px"/></a>
                        </div>
                    </div>
                    <div id="top-three">
                        <form  action="${pageContext.request.contextPath}/user_login" method="post" >
                            <tr >
                                <td colspan="2">
                                    <br>
                                    <span style="text-align: left;">&nbsp;&nbsp;&nbsp;&nbsp;<font size="4px"  color="black" >登录创新课堂</font></span>
                                    <span style="text-align: right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="regist.jsp" target="_blank">还没有账号，去注册</a></span>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <input type="text"   id="user" name="username" placeholder="输入用户名"   maxlength="12" onfocus="showTips()"  onblur="CheckUser()" ><!--style="background-color: transparent"-->
                                    <span id="namespan"></span>
                                </td>
                            </tr>
                                <td colspan="2">
                                    <input type="password" name="password"  id="password" placeholder="填写密码"  onfocus="showTips()"  onblur="CheckUser()"  />
                                   <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input type="checkbox" />下次自动登录
                                    <a href="updatePasswordByemail.jsp" id="forget">忘记密码?</a>
                                    <span id="pspan"></span>
                                </td>
                            </tr>
                              <TR>
                                <TD style="HEIGHT: 18px" colspan="2" ><font color="red" ><s:property value="exception.message" /> </font></TD>
                                <TD style="HEIGHT: 18px"></TD>
                            </TR>
                                <td colspan="2">
                                    <input type="submit" id="btn" value="登&nbsp;&nbsp;&nbsp;&nbsp;录"    style="background-color: #31b0d5" />
                                </td>
                            </tr>
                        </form>
                    </div>
                </div>
            </div>
    </div>
</div>
<!--页尾-->
<div id="footer"  class="container-fluid"  >
    <div id="yw">
        <span><a href="#"> 关于创新学堂 |  </a><a href="#"> 联系我们</a> |<a href="#"> 帮助中心</a>|Coyright @2018   创新课堂网络505  版权所有 </span></div>
</div>
</body>
</html>