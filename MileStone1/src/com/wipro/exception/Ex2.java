package com.wipro.exception;

public class Ex2 {
public static void main(String[] args) {
	int sum=0,avg=0;
	int a[]=new int[args.length];
	try {
	for(int i=0;i<args.length;i++) {
		a[i]=Integer.parseInt(args[i]);
	}
	for(int i=0;i<a.length;i++){
		sum+=a[i];
	}
	avg=sum/a.length;
	}
	catch(NumberFormatException e) {
		System.out.println("number format exception");
	}
	catch(ArithmeticException e) {
		System.out.println("arithmatic exception");
	}
	System.out.println(sum);
	System.out.println(avg);

}
}
