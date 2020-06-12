package com.wipro.flowcontrolstatements;

public class Ex7 {
public static void main(String[] args) {
	char c='a';
	if(Character.isLowerCase(c)) {
		System.out.println(c+"->"+Character.toUpperCase(c));
		
	}
	else {
		System.out.println(c+"->"+Character.toLowerCase(c));
	}
}
}
