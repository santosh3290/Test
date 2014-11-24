package net.viralpatel.contact.controller;

public class TestSuper {

	int a=50;
	static int b=60;
	{
		System.out.println("super Instance block");
		System.out.println(a);
		System.out.println(b);
	}
	
	static{
		System.out.println("super static block");
		//System.out.println(a);
		System.out.println(b);
	}
	
	public TestSuper(){
		int a=65;
		System.out.println(a);
		System.out.println("super default constructor");
	}
	
	public TestSuper(String name){
		int a=65;
		System.out.println(a);
		System.out.println(" super Argument constructor");
	}
}
