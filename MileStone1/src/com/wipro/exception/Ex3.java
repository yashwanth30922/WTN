package com.wipro.exception;

import java.util.Scanner;
 class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		super();
		System.out.println("NegativeValuesException occured");
	}
	
}
 class ValuesOutOfRangeException extends Exception {
		public ValuesOutOfRangeException() {
			super();
			System.out.println("ValuesOutOfRangeException occured");
		}
	}
public class Ex3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	for (int i = 0; i < 2; i++) {
		String name = "";
		int a=0,b=0,c=0;
		try {				
			name = sc.nextLine();
			
			if (sc.hasNextInt())
				a = sc.nextInt();
			else
				throw new NumberFormatException();
			
			if (sc.hasNextInt())
				b = sc.nextInt();
			else
				throw new NumberFormatException();
			
			if (sc.hasNextInt())
				c= sc.nextInt();
			else
				throw new NumberFormatException();
			
			if (a < 0)
				throw new NegativeValuesException();
			if (a > 100)
				throw new ValuesOutOfRangeException();
			if (b < 0) 
				throw new NegativeValuesException();
			if (b > 100)
				throw new ValuesOutOfRangeException();
			if (c < 0)
				throw new NegativeValuesException();
			if (c > 100)
				throw new ValuesOutOfRangeException();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NegativeValuesException e) {
			System.out.println(e.getMessage());
		} catch (ValuesOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Name: " + name);
		System.out.println("Marks of subject A: " + a);
		System.out.println("Marks of subject B: " + b);
		System.out.println("Marks of subject C: " + c);
	}
}
}
