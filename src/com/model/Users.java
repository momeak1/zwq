package com.model;


 
public class Users {
	private int id;
	private String name;		//账号
	private String password;	//密码
	private int point;			//积分
	private int level;			//等级
	
	
	public Users(String name, String password, int point, int level) {
		super();
		this.name = name;
		this.password = password;
		this.point = point;
		this.level = level;
	}

	public Users(int id, String name, int point, int level) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.level = level;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
