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
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<script src="js/jquery.js"></script>
<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>

</head>
<body>
<!--header-->


<!--aside nav-->
<aside class="lt_aside_nav content mCustomScrollbar">
 <h2><a href="index1.jsp">起始页</a></h2>
 <ul>
  <li>
   <dl>
    <dt><a href="index1.jsp" >文档管理</dt>
   </dl>
  </li>
  <li>
   <dl>
    <dt><a href="index2.jsp">用户管理</dt>
   </dl>
   <dl>
    <dt><a href="index3.jsp">评论管理</dt>
   </dl>
  </li>
  <li>
   <dl>
</aside>

<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
     
    
   
     <section class="loading_area">
      <div class="loading_cont">
       <div class="loading_icon"><i></i><i></i><i></i><i></i><i></i></div>
       <div class="loading_txt"><mark>数据正在加载，请稍后！</mark></div>
      </div>
     </section>
     <!--结束加载-->
     <!--弹出框效果-->
   
 
     <section>

      <div class="page_title">
       <h2 class="fl">资源列表</h2>
       <a class="fr top_rt_btn">右侧按钮</a>
      </div>
    <%--  <%
     request.setCharacterEncoding("utf-8");
     	Operate op = new Operate();
     	ArrayList<Resources> a1 = op.selectResources();
     %>
      <table class="table"  >
       <tr align="center">
        <th>编号</th>
        <th>名称</th>
        <th>分类</th>
        <th>用户</th>
        <th>时间</th>
        <th>操作</th>
       </tr>
       <%
       		for(Resources resources : a1){
       %>
       <tr align="center">
        <td><%=resources.getRsid() %></td>
        <td><%=resources.getRsname() %></td>
        <td><%=resources.getRspatch() %></td>
        <td><%=resources.getRssid() %></td>
        <td><%=resources.getRsdown() %></td>
        <td>
         <a href="SelectUserRes?rsid=<%=resources.getRsid() %>" target="_blank">详情</a>
         <a href="delRes1?rsid=<%=resources.getRsid() %>" class="inner_btn">删除</a>
        </td>
       </tr>
       <%} %>
      </table> --%>
     
     </section>
    

</body>
</html>
