package com.lti.SpringEx.SpringProject;

public class HelloWorldImpl implements HelloWorld {
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void add(int a,int b) {
		System.out.println("Sum is:");
		System.out.println(a+b);
	}
	
	public void sub(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public void greater(int x,int y) {
		if(x>y)
		System.out.println("a");
		else
		System.out.println("b");
	}
	
	
	
}
