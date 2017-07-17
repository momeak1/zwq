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
	<section class="rt_wrap content mCustomScrollbar">
	<div class="rt_content">
		<section>

		<div class="page_title">
			<h2 class="fl">图书列表</h2>
			
		</div>
		<%
			request.setCharacterEncoding("utf-8");
			Operate op = new Operate();
			ArrayList<Books> a1 = op.selectBooks();
		%>
		<table class="table">
			<tr align="center">
				<th>编号</th>
				<th>书本名称</th>
				<th>剩余数量</th>
				<th>类型</th>
				<th>作者</th>
				<th>被借出次数</th>
				<th>已借出数量</th>
				<th>操作</th>
			</tr>
			<%
				for (Books books : a1) {
			%>
			<tr align="center">
				<td><%=books.getId()%></td>
				<td><%=books.getName()%></td>
				<td><%=books.getCount()%></td>
				<td><%=books.getType()%></td>
				<td><%=books.getAuthor()%></td>
				<td><%=books.getDiscount()%></td>
				<td><%=books.getHasLended()%></td>
				<td><a href="" target="_blank">编辑</a> <a href=""
					class="inner_btn">删除</a></td>
			</tr>
			<%
				}
			%>
		</table>

		</section>
	</div>
	</section>


</body>
</html>
