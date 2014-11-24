package net.viralpatel.contact.controller;

public class Test{
	
	int a=5;
	static int b=6;
	{
		System.out.println("child Instance block");
		System.out.println(a);
		System.out.println(b);
	}
	
	static{
		System.out.println("child static block");
		//System.out.println(a);
		System.out.println(b);
	}
	
	public Test(){
		//super("monika");
		int a=6;
		System.out.println(a);
		System.out.println("child constructor");
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//new Test();
		//new Test();
		
		
		ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();
		
		 // Step 2: Define a class to be loaded.
		 
		String classNameToBeLoaded = "net.viralpatel.contact.controller.Test";

		
		 // Step 3: Load the class
		 
		Object myClass = myClassLoader.loadClass(classNameToBeLoaded).newInstance();

		
		 // Step 4: create a new instance of that class
		 
		//Object whatInstance = myClass.newInstance();
		
		System.out.println(myClass);
	}
}
