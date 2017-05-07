package com.java1995.reflect;

public class People {
	
	private int pid;
	private String name; 
	private String sex;
	
	public People(){
		
	}
	
	public People(int pid, String name, String sex) {
		super();
		this.pid = pid;
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "People [pid=" + pid + ", name=" + name + ", sex=" + sex + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	

}
