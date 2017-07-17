<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<header>
 <h1><img src="images/admin_logo.png"/></h1>
 <ul class="rt_nav">
  <!-- <li><a href="index.jsp" target="_blank" class="website_icon">站点首页</a></li> -->
  <li>欢迎使用：<%=session.getAttribute("username") %></li>
  <li><a href="login.jsp" target="_Top" class="quit_icon">安全退出</a></li>
 </ul>
</header>
</body>
</html>