package com.bct.java.functional.Interfaces;

/*
 * changes of interface on default and abstract method
 *
 */
interface DefaultandAbstract{
	// default method --- do consist of method body
	default void print() {
		System.out.println("interface is mainly developed to obtain 100% abstraction");
	}
	// abstract method - do not consist of method body
	public void myMethod(String message);
	
}


public class ChangesoffunctionalInterface implements  DefaultandAbstract{

	// implemented abstract method
	@Override
	public void myMethod(String message) {
		System.out.println("message is : "+message);
	}
	public static void main(String[] args) {
		

		ChangesoffunctionalInterface instance = new ChangesoffunctionalInterface();
		// calling the default method
		instance.print();
		// calling the abstract method
		instance.myMethod("good after noon guys");
	}

}
