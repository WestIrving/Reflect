package com.Classjava.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class 绕过泛型机制 {
	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("hello");
		//list2.add(10);  由于泛型机制list添加数字10会提示错误
		
		Class c2=list2.getClass(); //获得类类型
		
		try {
			Method m=c2.getMethod("add", Object.class);//输入统一为：Object对象
			m.invoke(list2, 10);
			System.out.println(list2);
			System.out.println(list2.size());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	

}
