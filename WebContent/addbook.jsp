<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="com.model.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.db.Operate"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员管理界面</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
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
	<section class="rt_wrap content mCustomScrollbar">
	<div class="rt_content">
		<section>
		<div class="page_title">
			<h2 class="fl">添加图书</h2>

		</div>
		<form action="Addbook" method="post">
			<table class="table">
				<tr align="center" >
					<td width="20%">书本名称</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr align="center">
					<td>剩余数量</td>
					<td><input type="text" name="count"></td>
				</tr>
				<tr align="center">
					<td>类型</td>
					<td><input type="text" name="type"></td>
				</tr>
				<tr align="center">
					<td>作者</td>
					<td><input type="text" name="author"></td>
				</tr>
				<!-- <tr align="center">
				
			<td>被借出次数</td>
			<td><input type="text" ></td>
			</tr>
			<tr align="center"><td>已借出数量</td>
			<td><input type="text" ></td>
			</tr> -->
				<tr align="center">
					<td><font style="color: red"><%=r%></font></td>
					<td><input type="submit" value="提交" />
					<input type="reset" value="重置" /></td>
				</tr>

			</table>
		</form>

		</section>
	</div>
	</section>


</body>
</html>
