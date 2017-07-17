package com.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Books;
import com.model.Users;

public class Operate {
	static String sql = null;  
    static DB db1 = null;  
    static ResultSet ret = null;
    
    /**
     * 验证管理员账号
     * @param username 账号
     * @param password 密码 
     * @return
     */
	public boolean checkAdmin(String username,String password)
	{
		boolean f = false;
		String sql = "SELECT * FROM admin WHERE username='"+username+"' and password='"+password+"'";
		db1 = new DB(sql);
		try{
			ret=db1.ps.executeQuery();
			f=ret.next();
			ret.close();  
	        db1.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return f;
	}
	
	/**
	 * 验证用户账号
	 * @param name 账号
	 * @param password 密码
	 * @return
	 */
	public boolean checkUser(String name, String password) {
		boolean f = false;
		String sql = "SELECT * FROM users WHERE name='"+name+"' and password='"+password+"'";
		db1 = new DB(sql);
		try{
			ret=db1.ps.executeQuery();
			f=ret.next();
			ret.close();  
	        db1.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return f;
	}

	/**
	 * 检查用户是否存在
	 * @param username  账号
	 * @return
	 */
	public boolean checkUser(String username) {
		boolean f = false;
		String sql = "SELECT * FROM users WHERE name='"+username+"'";
		db1 = new DB(sql);
		try{
			ret=db1.ps.executeQuery();
			f=ret.next();
			ret.close();  
	        db1.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return f;
	}

	public boolean addUser(Users user) {
		boolean f = false;
		String sql = "insert into users(name,password,point,level)VALUES(?,?,?,?)";
		db1 = new DB(sql);
		try{
			db1.ps.setString(1, user.getName());
			db1.ps.setString(2, user.getPassword());
			db1.ps.setInt(3, user.getPoint());
			db1.ps.setInt(4, user.getLevel());
			db1.ps.executeUpdate();
			f = true;
	        db1.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return f;
	}
	
	/**
	 * 查询用户列表
	 * @return
	 */
	public ArrayList<Users> selectUsers(){
		Users user;
		ArrayList<Users> users=new ArrayList();
		String sql = "select * from users";
		db1 = new DB(sql);
		try{
			ret=db1.ps.executeQuery();
			while (ret.next()) {
				int id = ret.getInt("id");
				String name = ret.getString("name");
				int point = ret.getInt("point");
				int level = ret.getInt("level");
				user=new  Users(id,name, point, level);
				users.add(user);
			}
			ret.close();
	        db1.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return users;
	}
	
	public ArrayList<Books> selectBooks(){
		Books book;
		ArrayList<Books> books=new ArrayList();
		String sql = "select * from books";
		db1 = new DB(sql);
		try{
			ret=db1.ps.executeQuery();
			while (ret.next()) {
				int id = ret.getInt("id");
				String name = ret.getString("name");
				int count = ret.getInt("count");
				String type = ret.getString("type");
				String author = ret.getString("author");
				int discount = ret.getInt("discount");
				int hasLended = ret.getInt("hasLended");
				book=new  Books(id, name, count, type, author, discount, hasLended);
				books.add(book);
			}
			ret.close();
	        db1.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return books;
	}

	public boolean addBooks(Books book) {
		boolean f = false;
		String sql = "insert into books(name,count,type,author,discount,hasLended)VALUES(?,?,?,?,?,?)";
		db1 = new DB(sql);
		try{
			db1.ps.setString(1, book.getName());
			db1.ps.setInt(2, book.getCount());
			db1.ps.setString(3, book.getType());
			db1.ps.setString(4, book.getAuthor());
			db1.ps.setInt(5, book.getDiscount());
			db1.ps.setInt(6, book.getHasLended());
			db1.ps.executeUpdate();
			f = true;
	        db1.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return f;
	}
	
}
