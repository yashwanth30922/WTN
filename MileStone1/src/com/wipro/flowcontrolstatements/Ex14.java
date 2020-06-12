package com.wipro.flowcontrolstatements;

public class Ex14 {
public static void main(String[] args) {
	int c=Integer.parseInt(args[0]);
	int i;
	for(i=0;c>0;c=c/10) {
		i=i+(c%10);
	}
		System.out.println(i);
	
}
}
