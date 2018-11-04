<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
     <%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>激  活</title>
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
</head>
<body>
  <%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
  %>
   <form action="${pageContext.request.contextPath}/user_activate" method="post" >
       <input   name="Username" value=<%=username%>>
       <input type="text"   id="password" name="password" value=<%=password%>   maxlength="12" >
      <input type="submit" id="btn" value="确定激活"    style="background-color: #31b0d5" />
      </form>
</body>
</html>