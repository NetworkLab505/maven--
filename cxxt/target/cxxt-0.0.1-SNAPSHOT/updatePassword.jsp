<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--声明文档的兼容模式，表示使用IE浏览器的最新模式-->
    <!--<meta name="viewport" content="width=device-width,initial-scale=1">-->
    <!--设置窗口宽度（值为设置的理想宽度），页面初始缩放值<理想宽度/可见宽度>-->
    <script type="text/javascript" src="js/jquery-1.11.3.min.js" ></script>
    <script type="text/javascript" src="js/bootstrap.min.js" ></script>
    <link rel="stylesheet" type="text/css" href="css/MailFind.css">
    <script type="text/javascript" src="js/MailFind.js"></script>
    <title>找回密码</title>
</head>
<body>
<div class="container">
<div id="large">
<!--logo设计-->
 <div class="header">
    <img src="img/Image%203.jpg" alt="QQ邮箱" >
   &nbsp; <span id="spanone">通过QQ邮箱找回创新课堂密码 </span>
 </div>
    <form  action="${pageContext.request.contextPath}/user_updatePasW" method="post">
    <div id="middle">
        <p  id="p_one" >1.填写创新课堂账号</p><br>
        <p class="p_two" >请输入创新课堂的邮箱号</p>
        <input type="text" name="mail" id="mail" maxlength="20" >
        <span  style="color: red" id="userspan"></span>
        <br>

            <p class="p_two" >请输入新的密码</p>
            <input type="password" name="password" id="password" maxlength="12"    >
            <span  style="color: red" id="psspan"></span>
            <br>


        <input type="submit" id="btn"  value="重置密码" style="background-color:#2aabd2; width: 67px; height: 31px"  onclick="return RcheckUser()">
    </div>
    </form>
    <!--页尾-->
    <div id="footer"  class="container-fluid"  >
        <div id="yw">
            <span style="font-size: small;">Coyright @2018   创新课堂网络505  版权所有</span></div>
    </div>
</div>
</div>
</body>
</html>
</head>
<body>

</body>
</html>