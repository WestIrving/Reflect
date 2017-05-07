package com.Classjava.reflect;

import java.lang.reflect.Method;

public class 反射的基本操作 {
	
	public static void main(String[] args) {
		//1.要获取对象的方法，现获取对象的类类型
		A a=new A();
		Class c=a.getClass();
		
		try {
			//2.获取方法：由方法名称，参数列表两者决定
			Method m1= c.getMethod("print");//参数列表若是没有可以不传
			//Method m1= c.getMethod("print",new Class[]{}); //也可以写成类类型的形式
			Method m2= c.getMethod("print",new Class[]{int.class,int.class});
			Method m3= c.getMethod("print",String.class,String.class);
			
			//第二种种写法：可以不写成Class数组的形式
			//c.getMethod("print", int.class,int.class);
			
			//3.调用方法     !!注意方法的返回值
			m1.invoke(a);
			//m1.invoke(a,Oblect[]{});  也可以写成传空Object数组的形式
			System.out.println("---------------");
			Object o=m2.invoke(a, 10,20);
			System.out.println("---------------");
			Object o1=m3.invoke(a,"hello","WORLD");
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}

}

class A{
	public void print(){   //1.无参数列表的方法
		System.out.println("666666");
	}
	public void print(int a,int b){//2.int参数列表的方法
		System.out.println(a+b);
	}
	
	public void print(String a,String b){//3.String参数列表的方法
		System.out.println(a.toUpperCase()+","+b.toLowerCase());
	}
}
