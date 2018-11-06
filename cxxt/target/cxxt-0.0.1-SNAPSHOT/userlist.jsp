<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>大学生创新项目管理系统</title>

    <link rel="stylesheet" type="text/css" href="<%=basePath%>/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="<%=basePath%>/pubjs/jquery-2.2.2.js"></script>
    <script type="text/javascript" src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
  
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/pubcss/manageHome.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/pubcss/public.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/pubcss/manageUser.css" />
	<script type="text/javascript" src="<%=basePath%>/pubjs/userInfo.js"></script>
    
    <!-- <script src="script/jquery-1.4.4.min.js"></script>
    <script src="script/jquery.jqprint-0.3.js"></script> -->
    
</head>
<body class="row">
    <div class="header">
        <div class="tssf">
            <img src="<%=basePath%>/images/bg.png" class="img-circle" alt="天水师范学院">
        </div>
        <h3><img src="<%=basePath%>/images/lotxt.png" alt="大学生创新协会"></h3>
     <p>欢迎${user.username}登录</p>
                         <p><a href="${pageContext.request.contextPath}/user_logout">注销登录</a></p>
    </div>
    <div class="fastpath">
        <button type="button" class="btn btn-info btn-default btn-block">人员管理</button>
        <div class="row fastpathfont">
            <div class="col-sm-3" >
                <a href="${pageContext.request.contextPath }/manage/manageHome.action" ><span class="glyphicon glyphicon-home"></span> 首页</a>
            </div>
            <div class="col-sm-3">
            	<a href="javascript:void(0)" id="personmanage"><span class="glyphicon glyphicon-user"></span>     人员列表</a>
            </div>
            <div class="col-sm-3">
            	<a href="javascript:void(0)" id="personelmessage"><span class="glyphicon glyphicon-tasks"></span>　个人信息维护</a>            	
            </div>
            <div class="col-sm-3">
            	<a href="javascript:void(0)" id="acountmanage"><span class="glyphicon glyphicon-apple"></span>　账号管理</a>
            </div>
        </div>
    </div>
     <div class="row search">
       	<form class="form-inline" action="${pageContext.request.contextPath }/user/userFindByEmail.action" method="post">
       		<div class="form-group">
			    <label for="department">学院</label>
			    <input type="text" class="form-control" id="department" placeholder="学院">
			 </div>
			 <div class="form-group">
			    <label for="email">邮箱</label>
			    <input type="email" class="form-control" id="email">				   
			 </div>
			 <div class="form-group">
			    <label for="sort">分组</label>
			    <input type="text" class="form-control" id="sort" placeholder="分组">
			 </div>
			 <div class="form-group">
			    <label for="plant">职务</label>
			    <input type="text" class="form-control" id="plant" placeholder="职务">
			 </div>				 
		 	<a class="btn btn-default" href="javascript:void(0)">
		 		<img class="searchimg" src="<%=basePath%>/images/search.png" alt="search" >			 		
		 	</a>				 					 
		</form>
    </div>
    <div id="personlist">
        <div class="tableBordertop">
                <ul>
                    <li>                     
                        <a class="add glyphicon glyphicon-plus" href="${pageContext.request.contextPath }/user_addUser">增加</a> 
                    </li>
                    <li>
                    	<span class="delete glyphicon glyphicon-remove-circle" >删除</span>   
                    </li>
                    <li>	
						<span class="edit glyphicon glyphicon-edit" >修改</span>
                    </li>
                    <li> 
                       <span class="save glyphicon glyphicon-save-file">保存文件</span>
                    </li>
                    <li>
                       <span class="print glyphicon glyphicon-print">打印列表</span>
                    </li>
                </ul>
        </div> 
        <table id="personallist" class="table table-bordered table-striped table-hover table-responsive">
            <thead>
            	 <tr>
                	<th> </th>
                	<th>
                   		 <input type="checkbox" id="checkall"  value="全选">
                	</th>
                	<th>姓名</th>               
                	<th>院系所</th>
                	<th>方向</th>
                	<th>电子邮箱</th>
                	<th>手机</th>            
                	<th>备注</th>               
            	</tr>  
            </thead>
           	<tbody>
           		<tr class="noList">
  					<td colspan="8">目前没有人员相关列表</td>  			
       			</tr>          
           		 <c:forEach var="user" items="${userList }">
       				<tr>
	       				<td>${user.id } </td>
	       				<td><input type="checkbox" name="checkbox" value=""></td>   			    
	       				<td>${user.name }</td>       				
	       				<td>${user.department }</td>
	       				<td>${user.major }</td>
	       				<td>${user.email }</td>
	       				<td>${user.mobile }</td>             				      			
	       				<td> </td>  
       				</tr>
           		 </c:forEach>
           	</tbody>        
        </table>
       	<div class="tableBorderbottom">
                <ul>
                    <li>
                       <a class="glyphicon glyphicon-step-backward" title="首页" href="${pageContext.request.contextPath }/json/user_listUser?pageNow=1"></a>
                    </li>
                    <li>
                        <a class="glyphicon glyphicon-chevron-left" title="上一页" href="${pageContext.request.contextPath }/json/user_listUser?pageNow=${pageNow-1}"></a>
                    </li>
                    <li>  
                    	<form id="page" action="${pageContext.request.contextPath }/json/user_listUser" method="post">
							<input type="text" name="pageNow" size="4" id="pageno" /> <input type="submit" name="submit" value="转到" id="page-skip"  />             		  	               	                      	              	
                    	</form>
                    </li>
                    <li>
                         <a class="glyphicon glyphicon-chevron-right" title="下一页" href="${pageContext.request.contextPath }/json/user_listUser?pageNow=${pageNow+1 }"></a>
                    </li>
                    <li>
                         <a class="glyphicon glyphicon-step-forward" title="尾页" href="${pageContext.request.contextPath }/json/user_listUser?pageNow=${pageCount}"></a>
                    </li>
                    <li>
                        <div class="col-sm-offset-9 col-sm-3 mersage" >
                            <span id="divFood">第<span class="page-now">${pageNow}</span>页/共${pageCount}页</span>
                        </div>
                    </li>
                </ul>
         </div>
    </div>
    <footer>
        <button class="btn btn-default btn-block">&copy;2016年 电子信息与电气工程学院 大学生创新基地</button>
    </footer>
</body>
</html>
