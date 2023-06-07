package com.dev.emp;

public class HelloEx {
	public static void main(String[] args) {
		
		for(String str :args) {
			System.out.println(str);
		}
		
		Hello hello =new Hello();
//		hello.name= "hong"; //private 클래스내에서 접근
		hello.age=20; // default 동일한 패키지내에서 접근가능
		hello.height=179.0; 
		
		System.out.println("end of prog");
	}
}
