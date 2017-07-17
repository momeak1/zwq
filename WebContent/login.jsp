<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<style>
body {
	height: 100%;
	background: #16a085;
	overflow: hidden;
}

canvas {
	z-index: -1;
	position: absolute;
}
</style>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		Object res = request.getAttribute("result");
		String r = "";
		if (res != null) {
			r = String.valueOf(res);
		}
	%>
	<form action="LoginServlet" method="post">
		<dl class="admin_login">
			<dt>
				<strong>管理员/用户登录界面</strong> <em>Management System</em>
			</dt>
			<dd class="user_icon">
				<input type="text" placeholder="账号" name="username"
					class="login_txtbx" />
			</dd>
			<dd class="pwd_icon">
				<input type="password" placeholder="密码" name="password"
					class="login_txtbx" />
			</dd>

			<dd>
				<center>
					<input type="radio" name="a" value="admin" />管理员&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="radio" name="a" value="user" checked />普通用户
				</center>
				<p><font style="color: red"><%=r%></font></p>
			</dd>
			
			<dd>
				<input type="submit" value="立即登录" class="submit_btn" />
			</dd>
			<dd>
				<p>
					<a href="reg.jsp">注册</a>
				</p>
			</dd>
		</dl>
	</form>
</body>
</html>
