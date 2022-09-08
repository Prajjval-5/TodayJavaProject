package com.bct.java.functional.Interfaces;

import java.util.function.IntBinaryOperator;

interface MyFunctionalinterface{

	public int addMethod(int a,int b);

}
public class Functioninterface {

    public int addMethod(int a,int b) {
    System.out.println("a + b is "+a+b);
    return a+b;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyFunctionalinterface sum = (a,b)-> a+b;
		System.out.println("result "+sum.addMethod(12,100));
		// predefined function interface
		// lambda expression
		System.out.println("------printed by the-------");
		IntBinaryOperator add = (a,b) -> a+b;
		System.out.println("result = "+add.applyAsInt(12,100));
		
	}
}