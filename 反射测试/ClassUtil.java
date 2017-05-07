package com.Classjava.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	    /*
	     * 获取类的方法
	     */
		public static void printClassMessage(Object obj){
			//获取类的信息，先获取类的类 类型
			Class c=obj.getClass();
			
	    //1.获得该类方法的名称
			System.out.println("该类的类名是："+c.getName());
		//2.获得该类的方法
			Method [] ms=c.getMethods();//获取所有public方法，包括继承的
			//或者c.getDeclaredMethods()获取该类自己声明的方法，不问访问权限
			
			
	    //3.显示出方法  -----返回值类型，方法名 （参数列表）
			for (int i = 0; i < ms.length; i++) {
				//获取方法返回值
				Class returnType=ms[i].getReturnType();
				System.out.print(returnType.getName()+" ");
				
				//获取方法名称
				System.out.print(ms[i].getName()+"("); 
				
				//获取参数列表---得到参数列表的类类型
				Class [] paramTypes=ms[i].getParameterTypes();
				for (Class c1 : paramTypes) {
					System.out.println(c1.getName()+",");
				}
				//显示右括号
				System.out.println(")");
			}
			
			printFieldMessage(c);
		}
		/*
	     * 获取类的成员变量
	     */

		public static void printFieldMessage(Object obj) {
			//获取成员变量类类型
			Class c=obj.getClass();
			Field [] fs=c.getDeclaredFields();
			for (Field field : fs) {
				//得到成员变量类型 的 类类型
				Class fieldType=field.getClass();
				//得到成员的类型名
				String TypeName=fieldType.getSimpleName();
				//得到成员的变量名
				String fieldName=field.getName();
				
				System.out.println(fieldType+" "+fieldName);
			}
		}
		
		/*
	     * 获取类的构造函数方法
	     */
		public static void printConstructorMessage(Object obj){
			Class c=obj.getClass();
			Constructor [] cs=c.getConstructors();
			for (Constructor constructor : cs) {
				System.out.print(constructor.getName()+"(");
				//获取构造函数参数列表
				Class [] paramTypes=constructor.getParameterTypes();
				for (Class class1 : paramTypes) {
					System.out.print(class1.getName()+",");
				}
				System.out.println(")");
			}
			
		}
		


}
