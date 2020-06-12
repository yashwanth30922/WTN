package com.wipro.flowcontrolstatements;

public class Ex1a {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	if(a<0) {
		System.out.println("negative");
	}
	else if(a>0) {
		System.out.println("positive");
	}
	else {
		System.out.println("zero");
	}
}
}
