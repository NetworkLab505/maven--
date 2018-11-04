<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--声明文档的兼容模式，表示使用IE浏览器的最新模式-->
    <!--<meta name="viewport" content="width=device-width,initial-scale=1">-->
    <!--设置窗口宽度（值为设置的理想宽度），页面初始缩放值<理想宽度/可见宽度>-->
    <title>创新课堂</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript"  src="js/index.js"></script> 
    <script type="text/javascript" src="js/bootstrap.min.js" ></script>
    <script type="text/javascript" src="js/onclicktimes.js"></script>
    <link  type="text/css" rel="stylesheet" href="css/index.css">

</head>
<body>


    <!--导航栏-->
    <div class="container" style=" width: 100% !important; padding-top: 35px;" >
        <nav class="navbar  navbar-default navbar-fixed-top"  style="background-color:white;border: 0px; height: 84px; " >
            <div class="nabar navbar-left" style="padding-top: 10px;">
                <img src="img/logo11.jpg"  class="img-responsive" style="height:60px; width: 210px;padding-left:25%;"/>
            </div>
            <div class="container-fluid">
                <div class="navbar-header " style="padding-top: 10px;">

                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="manageSyste.html"><font  size="4px" color="#101010">后台管理</font></a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-" >
                    <ul class="nav navbar-nav " style="padding-top: 10px;">
                        <li ><a href="next.html" ><font size="4px" color="#101010">前端开发</font> <span class="sr-only">(current)</span></a></li>
                        <li><a class="navbar-brand" href="next.html"><font size="4px" color="#101010">后端开发</font></a></li>
                        <li><a class="navbar-brand" href="next.html"><font size="4px" color="#101010">嵌入式系统设计</font></a></li>
                        <li><a class="navbar-brand" href="next.html"><font size="4px" color="#101010">开关电源</font></a></li>
                        <li><a  class="navbar-brand" href="next.html"><font size="4px" color="#101010">工控与机器人</font></a></li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right" style="padding-top: 26px;">
                        <li><span><p id="username"></p>
                        <a href="login.html" target="_blank"><font color="#101010" id="login"></font>
                            <a href="register.html" target="_blank"><font color="#101010" id="register"></font></a></span>
                        &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                        </li>
                    </ul>
                    <form class="navbar-form navbar-right " role="search" style="padding-top: 10px;">
                        <div class="form-group">
                            <a href="#">
                                <span class="glyphicon glyphicon-search"></span></a>
                            &nbsp;&nbsp; <input type="text"  style="width: 240px;height: 38px;" class="form-control" placeholder="请输入要查询的课程，老师，学校"/>
                            &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;
                         <p>欢迎${user.username}登录</p>
                         <p><a href="${pageContext.request.contextPath}/user_logout">注销登录</a></p>
                        </div>
                    </form>

                </div>
            </div>
        </nav>
    </div>


<!--轮播图-->
<div class="container "style="width: 1170px !important;" >
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox" style="height: 400px;">
            <div class="item active">
                <img src="img/51.jpg" alt="..." style="width:100%;height:400px;">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
            <div class="item">
                <img src="img/54.png" alt="..." style="width:100%;height:400px;">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
            <div class="item">
                <img src="img/2.jpg" alt="..." style="width:100%;height:400px;">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
            <div class="item">
                <img src="img/9.9.jpg"  alt="..." style="width:100%;height:400px;">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<!--推荐网页和课程-->
<div class="container" style="width: 1170px !important;">
    <div class="row" style="padding-top: 10px; padding-bottom: 8px;" >
			<span id="" style="font-size: 25px; padding-left: 25px; ">
               热门课程
			</span>

    </div>
    <!--网络开发与维护-->
    <div class="row">
        <div class=" col-lg-2 hidden-md  hidden-sm hidden-xs" style="height:410px; ">
            <a href="next.html"> <img src="img/b1.png"   height="489px"  width="243px"></a>
        </div>
        <div class=" col-lg-10 col-md-10 col-sm-12 col-xs-10" style="padding-left: 10px; ">
            <div class="row">
                <div class=" col-lg-6 col-md-3  col-sm-2 col-xs-5" style=" padding-left: 80px;">
                    <div class="oneleft">
                         <video height="183px" width="410px" controls autoplay>
        <source src="movie.mp4" type="video/mp4">
      <object data="#video_first" height="183px" width="410px">
        <embed width="500" height="500" src="F:/video/5b0eb76c647a4.swf">
      </object>
    </video>
                            <span   id="one"><font size="4px"  face="宋体" color="black">WEB全栈开发</font></span>
                        </a>
                        <br/><span>   点击次数：<span id="span1">0次</span> </span>
                    </div>

                </div>
                <div class="col-lg-6  col-md-3 col-sm-2 col-xs-6" >
                    <div class="oneright">
                    <video height="183px" width="410px" controls autoplay>
        <source src="movie.mp4" type="video/mp4">
         <object data="F:/video/5b0eb76c647a4.mp4" height="183px" width="410px">
        <embed width="500" height="500" src="F:/video/5b0eb76c647a4.swf">
      </object>
    </video><br>
                        <font size="4px"  face="宋体" color="black" >HTML5入门</font>
                    </a>
                        <br/>
                    <span >   点击次数：0次 </span>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-6 col-md-3 col-sm-2 col-xs-12" style=" padding-top:20px;padding-left:80px;">
                    <div class="oneleft">
                    <video height="183px" width="410px" controls autoplay>
       <source src="movie.mp4" type="video/mp4">
      <object data="F:/video/5b0eb76c647a4.mp4" height="183px" width="410px">
        <embed width="500" height="500" src="F:/video/5b0eb76c647a4.swf">
      </object>
    </video>
                    <br/> <font size="4px"  face="宋体" color="black" >CSS3和JavaScript入门</font>
                    </a>
                        <br/><span >   点击次数：0次 </span>
                    </div>
                </div>
                <div class="col-lg-6 col-md-3 col-sm-4 col-xs-6"style="padding-top: 20px;" >
                    <div class="oneright">
                    <a href="#"> <video height="183px" width="410px" controls autoplay>
       <source src="movie.mp4" type="video/mp4">
      <object data="F:/video/5b0eb76c647a4.mp4" height="183px" width="410px">
        <embed width="500" height="500" src="F:/video/5b0eb76c647a4.swf">
      </object>
    </video>
                    <br>
                        <font size="4px"  face="宋体" color="black" >JAVAEE</font>
                    </a>
                        <br/> <span >   点击次数：0次 </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--嵌入式系统设计-->
<div class="container" style="margin-top:30px;width: 1170px !important;">
    <div class="row">
        <div class=" col-lg-2 hidden-md col-sm-2 hidden-sm hidden-xs" style=" height:410px;">

            <a href="#"> <img src="img/b2.png" height="498px" width="243px"></a>
        </div>
        <div class=" col-lg-10 col-md-10 col-sm-10 col-xs-10 " style="padding-left: 10px;">
            <div class="row">
                <div class=" col-lg-6 col-md-3 col-sm-1 col-xs-3" style=" padding-left: 80px;">
                    <div class="oneleft">
                    <a href="#"><img src="img/嵌入式.jpg" height="183px" width="410px"/>
                        <font size="4px"  face="宋体" color="black" >C语言基础知识</font></a>
                    <br/><span >   点击次数：0次 </span>
                    </div>
                </div>
                <div class=" col-lg-6 col-md-3 col-sm-3 col-xs-3" >

                    <div class="oneright">
                    <a href="#"> <img src="img/26.jpg"  style="width:460px;height:183px;"/>
                        <font size="4px"  face="宋体" color="black" >Linux开发程序设计</font>
                    </a>
                   <br> <span >   点击次数：0次 </span>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class=" col-lg-6 col-md-3 col-sm-12 col-xs-3" style="/*height: 251px;width: 490px;*/ padding-top:20px;padding-left:80px;">
                    <div class="oneleft">
                    <a href="#"><img src="img/c5.jpg" style="height:183px; width:410px;"/>
                        <font size="4px"  face="宋体" color="black" >物联网基础</font>
                    </a>
                   <br> <span >   点击次数：0次 </span>
                    </div>
                </div>
                <div class=" col-lg-6 col-md-3 col-sm-4 col-xs-3"style="padding-top: 20px;" >
                    <div class="oneright">
                    <a href="#"><img src="img/22.1.jpg"  style="width:460px;height:183px;"/>
                        <font size="4px"  face="宋体" color="black" >Android移植开发</font>
                    </a>
                    <br><span >   点击次数：0次 </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!--开关电源-->
    <div class="container" style="margin-top:30px;width: 1170px !important;">
        <div class="row" style="height: 250px">
            <div class=" col-lg-2 hidden-md col-sm-2 hidden-sm hidden-xs" >
                <a href="#"> <img src="img/b3.jpg"  width="243px"></a>
            </div>
            <div class=" col-lg-10 col-md-10 col-sm-10 col-xs-10 " style="padding-left: 10px;">
                <div class="row">
                  <div class=" col-lg-2 col-md-3 col-sm-3 col-xs-3" style=" padding-left: 80px;">
                    <!--重定义图片div-->
                    <div class="threeleft">
                   <a href="#">
                       <img src="img/c11-1.jpg" height="175px" width="280px"/>
                        <font size="4px"  face="宋体" color="black" >开关电源入门</font>
                   </a>
                        <br/>
                        <span >   点击次数：0次 </span>
                    </div>
                </div>


                    <div class=" col-lg-2 col-md-3 col-sm-3 col-xs-3" style=" padding-left: 221px;">
                        <div class="threeleft">
                            <a href="#">
                                <img src="img/5.jpg" height="175px" width="280px"/>
                                <font size="4px"  face="宋体" color="black" >电子基础知识</font>
                            </a>
                            <br/>
                            <span >   点击次数：0次 </span>
                        </div>
                    </div>


                    <div class=" col-lg-2 col-md-3 col-sm-3 col-xs-3" style=" padding-left: 284px;">
                        <!--重定义图片div-->
                        <div class="threeleft">
                            <a href="#">
                                <img src="img/47.jpg" height="175px" width="280px"/>
                                <font size="4px"  face="宋体" color="black" >直流开关电源</font>
                            </a>
                            <br/>
                            <span >   点击次数：0次 </span>
                        </div>
                    </div>

            </div>
        </div>
    </div>

    <!--工控与机器人-->
        <div class="container" style="margin-top:30px;width: 1170px !important;">
            <div class="row" width="1170px">
                <div class=" col-lg-2 hidden-md col-sm-2 hidden-sm hidden-xs" style="margin-left: -16px">
                    <a href="#"> <img src="img/b4.png" height="475px" width="243px"></a>
                </div>
                <div class=" col-lg-10 col-md-10 col-sm-10 col-xs-10 " style="padding-left: 10px;">
                    <div class="row">
                        <div class=" col-lg-2 col-md-3 col-sm-3 col-xs-3" style=" padding-left: 80px;">
                            <!--重定义图片div-->
                            <div class="threeleft">
                                <a href="#">
                                    <img src="img/c6.jpg" height="175px" width="280px"/>
                                    <font size="4px"  face="宋体" color="black" >线性代数</font>
                                </a>
                                <br/>
                                <span >   点击次数：0次 </span>
                            </div>
                        </div>
                        <div class=" col-lg-2 col-md-3 col-sm-3 col-xs-3" style=" padding-left: 221px;">
                            <div class="threeleft">
                                <a href="#">
                                    <img src="img/c8.jpg" height="175px" width="280px"/>
                                    <font size="4px"  face="宋体" color="black" >Python基础</font>
                                </a>
                                <br/>
                                <span >   点击次数：0次 </span>
                            </div>
                        </div>
                        <div class=" col-lg-2 col-md-3 col-sm-3 col-xs-3" style=" padding-left: 284px;">
                            <!--重定义图片div-->
                            <div class="threeleft">
                                <a href="#">
                                    <img src="img/c4.jpg" height="175px" width="280px"/>
                                    <font size="4px"  face="宋体" color="black" >Makefile</font>
                                </a>
                                <br/>
                                <span >   点击次数：0次 </span>
                            </div>
                        </div>
                    </div>
                </div>


                <div class=" col-lg-10 col-md-10 col-sm-10 col-xs-10 " style="padding-left: 10px;">
                    <div class="row">
                        <div class=" col-lg-2 col-md-3 col-sm-3 col-xs-3" style=" padding-top: 25px; padding-left: 80px;">
                            <!--重定义图片div-->
                            <div class="threeleft">
                                <a href="#">
                                    <img src="img/c3.jpg" height="175px" width="280px"/>
                                    <font size="4px"  face="宋体" color="black" >机械加工</font>
                                </a>
                                <br/>
                                <span >   点击次数：0次 </span>
                            </div>
                        </div>
                        <div class=" col-lg-2 col-md-3 col-sm-3 col-xs-3" style=" padding-top: 25px; padding-left: 221px;">
                            <div class="threeleft">
                                <a href="#">
                                    <img src="img/d10.jpg" height="175px" width="280px"/>
                                    <font size="4px"  face="宋体" color="black" >电路焊接</font>
                                </a>
                                <br/>
                                <span >   点击次数：0次 </span>
                            </div>
                        </div>
                        <div class=" col-lg-2 col-md-3 col-sm-3 col-xs-3" style=" padding-top: 25px; padding-left: 284px;">
                            <!--重定义图片div-->
                            <div class="threeleft">
                                <a href="#">
                                    <img src="img/29.jpg" height="175px" width="280px"/>
                                    <font size="4px"  face="宋体" color="black" >制作导线</font>
                                </a>
                                <br/>
                                <span >   点击次数：0次 </span>
                            </div>
                        </div>
                    </div>
                </div>

            </div>


    <!--学习网站-->
    <div class="container" style="width: 1170px !important;padding-top: 7px;">
        <div class="row" >
			<p style=" padding-left: 25px; ">
                <font face="宋体" color="black" size="5px">学习网站&nbsp; </font>
                <a href="#">更多网站>></a>
			</p>

        </div>
        <div style="padding-top: 6px;">
          <a href="http://www.itcast.cn" target="_blank"> <img src="img/logo2.jpg">
          </a>
            <a href="http://www.itheima.com" target="_blank"> <img src="img/logo3.jpg" ></a>

            <a href="http://www.w3cschool.cn" target="_blank"> <img src="img/logo4.jpg"></a>

            <a href="http://www.csdn.net" target="_blank"> <img src="img/logo5.jpg" ></a>
            <a href="http://cn.ubuntu.com" target="_blank"> <img src="img/logo6.jpg" ></a>
        </div>
    </div>
</div>
<!--页尾-->
    <div id="footer"  class="container-fluid"  >
        <div id="mkw"><a>慕课网</a></div>
        <div id="xt"><a>学堂在线</a></div>
        <div id="cn"><a>菜鸟教程</a></div>
        <div id="tx"><a>腾讯课堂</a></div>
        <div id="yw">Coyright @2018   创新课堂网络505  版权所有</div>
    </div>
</body>
</html>