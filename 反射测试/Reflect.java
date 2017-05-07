package com.java1995.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflect {
	
	public static void main(String[] args) throws Exception{
		People p= new People();
		//获得类类型
		Class class1=p.getClass();
		 
		//获得People的构造函数
		Constructor constructor=class1.getConstructor(new Class []{int.class,String.class,String.class});
		
		//通过newInstance来创建对象
		Object object=constructor.newInstance(new Object[]{1001,"张三","男"});
		
		System.out.println(object);
		
		//获得People的SetName方法
		Method m=class1.getDeclaredMethod("setName",String.class);
		
		//使用SetName方法
		Object o=m.invoke(object, "李四");
		
		System.out.println(object);
		
	}

}
