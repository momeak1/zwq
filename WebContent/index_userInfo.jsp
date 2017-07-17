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
       <h2 class="fl">用户列表</h2>
      </div>
     <%
     	request.setCharacterEncoding("utf-8");
     	Operate op = new Operate();
     	ArrayList<Users> a1 = op.selectUsers();
     %>
      <table class="table"  >
       <tr align="center">
        <th>编号</th>
        <th>用户名称</th>
        <th>积分</th>
        <th>等级</th>
        <th>超时未还</th>
        <th>操作</th>
       </tr>
       <%
       		for(Users users : a1){
       %>
       <tr align="center">
        <td><%=users.getId() %></td>
        <td><%=users.getName() %></td>
        <td><%=users.getPoint() %></td>
        <td><%=users.getLevel() %></td>
        <td></td>
        <td>
         <a href="" target="_blank">冻结</a>
         <a href="" class="inner_btn">解冻</a>
        </td>
       </tr>
       <%} %>
      </table>
      
     </section>
    </div>
    </section>
    

</body>
</html>
