package com.wipro.flowcontrolstatements;

public class Ex17 {
public static void main(String[] args) {
	int c1=0,c2=0,i,j,revn=0;
	int c=Integer.parseInt(args[0]);
	int x=c;
	for(;c!=0;) {
		revn=revn*10;
		revn=revn+(c%10);
		c=c/10;
	}
	if(x==revn) {
		System.out.println("It is a palindrome");
	}
	else {
		System.out.println("Not a plaindrome");
	}
}
}
