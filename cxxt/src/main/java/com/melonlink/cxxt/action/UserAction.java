package com.melonlink.cxxt.action;

import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.melonlink.cxxt.GETutil.pageShow;
import com.melonlink.cxxt.entity.User;
import com.melonlink.cxxt.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class UserAction extends ActionSupport implements ModelDriven<User> {
	
	private static final long serialVersionUID = 1L;
	private User user = new User();
	private UserService userService;
	private HttpServletRequest request;
	private String Username;
	private int pageNow = 1;// 动态改变 页面取得
	private int pageSize = 5;// 固定不变
	private Map<String, Object> MapList;
	public String zhuce() throws Exception {//注册
	        //调用service层发送手机号码以及激活邮箱
		    System.out.println("dawefes");
			User u = userService.sendMobile(user);
			//将返回的user对象放到session域
			ActionContext.getContext().getSession().put("user", u);
			System.out.println(user.getUsername());
		//3.重定向到登录页
		return "success";
	}
	public String SaveUser() throws Exception {//保存注册用户
		System.out.println("保存注册用户");
		 //通过验证保存注册信息
		 User users=(User)ActionContext.getContext().getSession().get("user");
		 //users.setVerificationde(user.getVerificationde());
		 users.setCreateData(new Timestamp(System.currentTimeMillis()));//获取当前注册的系统时间
		userService.saveUser(users);
	     return "toHome";
    }
	public String login() throws Exception {//登录
		//1.调用service执行登陆逻辑
		System.out.println("登录");
		User u = userService.getUserBynamePassword(user);
		user.setLoginData(new Timestamp(System.currentTimeMillis()));//获取当前登录的系统时间
		InetAddress addr = InetAddress.getLocalHost();  
        String ip=addr.getHostAddress().toString(); //获取本机ip  
        user.setCurrentIP(ip);
        System.out.println(ip);
		System.out.println("登录成功1");
		 userService.saveTimeIP(user.getLoginData(),user.getCurrentIP());//保存登录时间和本机IP
	   //2.将返回的user对象放到session域
		ActionContext.getContext().getSession().put("user", u);
	  //3.重定向到项目首页
		System.out.println("登录成功");
	   return "success";
    }
	public String activate() throws Exception {//通过用户名发送邮箱激活邮箱
		//1.调用service执行登陆逻辑
		System.out.println(user.getUsername()+"通过用户名发送邮箱激活邮箱");
		 User u = userService.setEmailByusername(user.getUsername());
	   //2.将返回的user对象放到session域
		ActionContext.getContext().getSession().put("user", u);
	  //3.重定向到项目首页
	   return SUCCESS;
    }
	public String updatePaWByemail() {//通过邮箱找回密码即发送邮箱
		userService.findPasWByemail(user.getMail());
		return SUCCESS;
	}
	public String updatePasW() {//通过邮箱修改密码
		userService.updatePasWByemail(user);
		return SUCCESS;
	}
	
	public String listUser()throws Exception{//查询用户列表
		System.out.println("调用Service层");
		List<User> userList= userService.getAlluserList(pageNow, pageSize);
		System.out.println("调用完Service层");
		if (userList.size() > 0) {// 用户列表
		 for (User user : userList) { 
		 System.out.println("User info --> " + user.toString());		
			}
		 MapList.put("userList", userList);
		 pageShow page = new pageShow(pageNow,pageSize);// 实例化分页对象
		 MapList.put("page",page);
		return "success";
		}
		return "error";
	  }
	public String addUser()throws Exception{//增加用户
		System.out.println("保存增加的用户");
		User users=(User)ActionContext.getContext().getSession().get("user");
		 users.setCreateData(new Timestamp(System.currentTimeMillis()));//获取当前注册的系统时间
		 users.setEnabled(1);
		 userService.saveAddUser(users);	
		return SUCCESS;
    }
    
    public String deleteUser()throws Exception{//删除用户
    	String currentEmail=request.getParameter("mail");//通过页面得到邮箱号
    	User currentUser = userService.findUserByEmail(currentEmail);// 根据用户邮箱查询到用户
		if(currentUser!=null){
			System.out.println("用户："+currentUser.getUsername() + "登录邮箱："+ currentUser.getMail() + " 被删除!");
			userService.deleteUser(currentUser);// 根据用户删除用户
			System.out.println("删除成功！");
			return SUCCESS;
		}
		else
		{
			System.out.println("通过邮箱没有找到用户，删除失败！");
    	return "failed";
		}
  	} 
    
    public String updateUser()throws Exception{//通过邮箱修改用户
    	String currentEmail=request.getParameter("mail");//通过页面得到邮箱号
    	User currentUser = userService.findUserByEmail(currentEmail);// 根据用户邮箱查询到用户
    	if(currentUser!=null){
			System.out.println("用户："+currentUser.getUsername() + "登录邮箱："+ currentUser.getMail() + " 被修改!");
			User users=(User)ActionContext.getContext().getSession().get("user");//从页面得到修改后的user对象
			userService.deleteUser(currentUser);// 根据用户删除用户
			users.setCreateData(new Timestamp(System.currentTimeMillis()));//获取当前注册的系统时间
			 users.setEnabled(1);
			 userService.saveAddUser(users);//保存修改后的用户	
			return SUCCESS;
		}
		else
		{
			System.out.println("通过邮箱没有找到用户，修改失败！");
    	    return "failed";
		}
	}	
    public String logout()throws Exception{//注销登录
    	HttpServletRequest request = ServletActionContext.getRequest();
    	HttpSession session = request.getSession();
		session.invalidate();
		return "logout";
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	@Override
	public User getModel() {
		return user;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
