package com.wipro.strings;

public class Ex1 {
public static void main(String[] args) {
	String s="pop";
	String s1="";

	int x=s.length();
	for(int i=x-1;i>=0;i--) {
	
		s1=s1+s.charAt(i);
	}
	if(s1.equals(s)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
}
