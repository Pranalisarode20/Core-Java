package com.oper;

public class Addition {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		int d = a + 2;
		int c = a / b;
		
		System.out.println("Addtion of " + a + " + " + b + " = " +c);
		System.out.println("Sub of " + a + " - " + b + " = " +(a - b));
		System.out.println("Multiplication of " + a + " * " + b + " = " +(a * b));
		System.out.println("Division of " + a + " / " + b + " = " +(d / c) + " Quotient ");
		System.out.println("Mod of " + a + " % " + b + " = " +(c % b) + " Remainder ");
	}

}
