package com.wipro.classes_objects;
class Calc{
	static double powerInt(int n1,int n2) {
		 return Math.pow(n1,n2);
	}
	static double powerDouble(double n1,int n2) {
		 return Math.pow(n1,n2);
	}
}
public class Calculator {
public static void main(String[] args) {
	System.out.println(Calc.powerInt(2,2));
	System.out.println(Calc.powerDouble(2.3,2));
}
}
