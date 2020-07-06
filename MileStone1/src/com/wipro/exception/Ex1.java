package com.wipro.exception;

import java.util.Scanner;

public class Ex1 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	try {
		System.out.println("enter the index of element you want to access");
		int index=sc.nextInt();
		System.out.println("the array element at index"+""+index+""+a[index]);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
