/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-04 01:43:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>大学生创新项目管理系统</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("/bootstrap/css/bootstrap-theme.min.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/pubjs/jquery-2.2.2.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("/pubcss/manageHome.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("/pubcss/public.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("/pubcss/manageUser.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/pubjs/userInfo.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- <script src=\"script/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("    <script src=\"script/jquery.jqprint-0.3.js\"></script> -->\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"row\">\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <div class=\"tssf\">\r\n");
      out.write("            <img src=\"");
      out.print(basePath);
      out.write("/images/bg.png\" class=\"img-circle\" alt=\"天水师范学院\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <h3><img src=\"");
      out.print(basePath);
      out.write("/images/lotxt.png\" alt=\"大学生创新协会\"></h3>\r\n");
      out.write("     <p>欢迎");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("登录</p>\r\n");
      out.write("                         <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user_logout\">注销登录</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"fastpath\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-info btn-default btn-block\">人员管理</button>\r\n");
      out.write("        <div class=\"row fastpathfont\">\r\n");
      out.write("            <div class=\"col-sm-3\" >\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/manage/manageHome.action\" ><span class=\"glyphicon glyphicon-home\"></span> 首页</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-3\">\r\n");
      out.write("            \t<a href=\"javascript:void(0)\" id=\"personmanage\"><span class=\"glyphicon glyphicon-user\"></span>     人员列表</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-3\">\r\n");
      out.write("            \t<a href=\"javascript:void(0)\" id=\"personelmessage\"><span class=\"glyphicon glyphicon-tasks\"></span>　个人信息维护</a>            \t\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-3\">\r\n");
      out.write("            \t<a href=\"javascript:void(0)\" id=\"acountmanage\"><span class=\"glyphicon glyphicon-apple\"></span>　账号管理</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("     <div class=\"row search\">\r\n");
      out.write("       \t<form class=\"form-inline\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/userFindByEmail.action\" method=\"post\">\r\n");
      out.write("       \t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"department\">学院</label>\r\n");
      out.write("\t\t\t    <input type=\"text\" class=\"form-control\" id=\"department\" placeholder=\"学院\">\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"email\">邮箱</label>\r\n");
      out.write("\t\t\t    <input type=\"email\" class=\"form-control\" id=\"email\">\t\t\t\t   \r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"sort\">分组</label>\r\n");
      out.write("\t\t\t    <input type=\"text\" class=\"form-control\" id=\"sort\" placeholder=\"分组\">\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"plant\">职务</label>\r\n");
      out.write("\t\t\t    <input type=\"text\" class=\"form-control\" id=\"plant\" placeholder=\"职务\">\r\n");
      out.write("\t\t\t </div>\t\t\t\t \r\n");
      out.write("\t\t \t<a class=\"btn btn-default\" href=\"javascript:void(0)\">\r\n");
      out.write("\t\t \t\t<img class=\"searchimg\" src=\"");
      out.print(basePath);
      out.write("/images/search.png\" alt=\"search\" >\t\t\t \t\t\r\n");
      out.write("\t\t \t</a>\t\t\t\t \t\t\t\t\t \r\n");
      out.write("\t\t</form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"personlist\">\r\n");
      out.write("        <div class=\"tableBordertop\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>                     \r\n");
      out.write("                        <a class=\"add glyphicon glyphicon-plus\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user_addUser\">增加</a> \r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                    \t<span class=\"delete glyphicon glyphicon-remove-circle\" >删除</span>   \r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\t\r\n");
      out.write("\t\t\t\t\t\t<span class=\"edit glyphicon glyphicon-edit\" >修改</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li> \r\n");
      out.write("                       <span class=\"save glyphicon glyphicon-save-file\">保存文件</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                       <span class=\"print glyphicon glyphicon-print\">打印列表</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        </div> \r\n");
      out.write("        <table id=\"personallist\" class=\"table table-bordered table-striped table-hover table-responsive\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            \t <tr>\r\n");
      out.write("                \t<th> </th>\r\n");
      out.write("                \t<th>\r\n");
      out.write("                   \t\t <input type=\"checkbox\" id=\"checkall\"  value=\"全选\">\r\n");
      out.write("                \t</th>\r\n");
      out.write("                \t<th>姓名</th>               \r\n");
      out.write("                \t<th>院系所</th>\r\n");
      out.write("                \t<th>方向</th>\r\n");
      out.write("                \t<th>电子邮箱</th>\r\n");
      out.write("                \t<th>手机</th>            \r\n");
      out.write("                \t<th>备注</th>               \r\n");
      out.write("            \t</tr>  \r\n");
      out.write("            </thead>\r\n");
      out.write("           \t<tbody>\r\n");
      out.write("           \t\t<tr class=\"noList\">\r\n");
      out.write("  \t\t\t\t\t<td colspan=\"8\">目前没有人员相关列表</td>  \t\t\t\r\n");
      out.write("       \t\t\t</tr>          \r\n");
      out.write("           \t\t <c:forEach var=\"user\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userList }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("       \t\t\t\t<tr>\r\n");
      out.write("\t       \t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </td>\r\n");
      out.write("\t       \t\t\t\t<td><input type=\"checkbox\" name=\"checkbox\" value=\"\"></td>   \t\t\t    \r\n");
      out.write("\t       \t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>       \t\t\t\t\r\n");
      out.write("\t       \t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.department }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t       \t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.major }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t       \t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t       \t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.mobile }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>             \t\t\t\t      \t\t\t\r\n");
      out.write("\t       \t\t\t\t<td> </td>  \r\n");
      out.write("       \t\t\t\t</tr>\r\n");
      out.write("           \t\t </c:forEach>\r\n");
      out.write("           \t</tbody>        \r\n");
      out.write("        </table>\r\n");
      out.write("       \t<div class=\"tableBorderbottom\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                       <a class=\"glyphicon glyphicon-step-backward\" title=\"首页\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/json/user_listUser?pageNow=1\"></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"glyphicon glyphicon-chevron-left\" title=\"上一页\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/json/user_listUser?pageNow=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNow-1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>  \r\n");
      out.write("                    \t<form id=\"page\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/json/user_listUser\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"pageNow\" size=\"4\" id=\"pageno\" /> <input type=\"submit\" name=\"submit\" value=\"转到\" id=\"page-skip\"  />             \t\t  \t               \t                      \t              \t\r\n");
      out.write("                    \t</form>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                         <a class=\"glyphicon glyphicon-chevron-right\" title=\"下一页\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/json/user_listUser?pageNow=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNow+1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                         <a class=\"glyphicon glyphicon-step-forward\" title=\"尾页\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/json/user_listUser?pageNow=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"col-sm-offset-9 col-sm-3 mersage\" >\r\n");
      out.write("                            <span id=\"divFood\">第<span class=\"page-now\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNow}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>页/共");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("页</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("         </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <button class=\"btn btn-default btn-block\">&copy;2016年 电子信息与电气工程学院 大学生创新基地</button>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
