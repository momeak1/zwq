package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DB {
	
	static String url="jdbc:mysql://127.0.0.1:3306/libray?characterEncoding=utf-8";
	static String user="root";
	static String pwd="123";
	static String name="com.mysql.jdbc.Driver";
	Connection dbConn=null;
	PreparedStatement ps=null;


	
	public DB(String sql){
		try {
			Class.forName(name);
			dbConn = DriverManager.getConnection(url, user, pwd);
			ps=dbConn.prepareStatement(sql);
			//System.out.println("连接数据库成功！");
			
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("连接数据库失败！");
			
		}
	}
	
	public void close(){
		try {
			this.dbConn.close();
			this.ps.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}
