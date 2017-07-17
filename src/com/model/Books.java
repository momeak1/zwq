package com.model;

public class Books {
	private int id;
	private String name;	//书本名称
	private int count;		//剩余数量
	private String type;	//类型
	private String author;	//作者
	private int discount;	//被借出次数
	private int hasLended;	//已借出数量
	//private int countAll;	//馆藏原有数量
	
	
	
	public Books(String name, int count, String type, String author, int discount, int hasLended) {
		super();
		this.name = name;
		this.count = count;
		this.type = type;
		this.author = author;
		this.discount = discount;
		this.hasLended = hasLended;
		//this.countAll = count+hasLended;
	}
	
	public Books(int id, String name, int count, String type, String author, int discount, int hasLended) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
		this.type = type;
		this.author = author;
		this.discount = discount;
		this.hasLended = hasLended;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getHasLended() {
		return hasLended;
	}
	public void setHasLended(int hasLended) {
		this.hasLended = hasLended;
	}
	/*public int getCountAll() {
		return countAll;
	}*/
	/*public void setCountAll(int countAll) {
		this.countAll = countAll;
	}*/
	
	
	
}
