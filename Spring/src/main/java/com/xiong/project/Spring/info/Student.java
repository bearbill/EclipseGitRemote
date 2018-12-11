package com.xiong.project.Spring.info;

import java.util.List;

public class Student {
	
	
	private String name;
	private int age;
	private List list;
	
	
	public Student(String name,int age)
	{
		this.name = name;
		this.age = age;
		
	}
	
	public Student()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return this.name +","+this.age;
	}

	

}
