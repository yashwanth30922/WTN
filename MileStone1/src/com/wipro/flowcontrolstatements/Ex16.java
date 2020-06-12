package com.wipro.flowcontrolstatements;

public class Ex16 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int revn=0;
	for(;n!=0;) {
		revn=revn*10;
		revn=revn+(n%10);
		n=n/10;
	}
	System.out.println(revn);
}
}
