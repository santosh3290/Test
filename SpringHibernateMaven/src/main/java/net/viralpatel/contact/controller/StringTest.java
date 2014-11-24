package net.viralpatel.contact.controller;

public class StringTest {

	public static void main(String[] args) {
		
		String str="monika";
		
		String str1="monika";
		
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		
		
		String str2=new String("monika");
		
		String str3=new String("monika");
		
		System.out.println(str2.equals(str3));
		System.out.println(str2==str3);
		
		System.out.println(str2.equals(str));
		System.out.println(str2==str);
	}
}
