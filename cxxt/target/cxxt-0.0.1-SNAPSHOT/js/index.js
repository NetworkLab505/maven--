$(function(){
     $.ajax({
           type:'post',
           dataType:'json',
           url:"zhuceAction_login",
           success:function(data){
	       if(data){
		       $("#username").html("欢迎用户"+data+"进入创新学堂");
  	         }
  	        else{
  		       $("#login").html("登录");
  		       $("#register").html("注册");     
            } 
        }
     }
   )
  }
)