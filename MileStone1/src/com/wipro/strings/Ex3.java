package com.wipro.strings;

public class Ex3 {
public String example(String str) {
	String x="";
	for(int i=0;i<str.length();i++) {
	x=x+str.substring(0,2);
	}
	return x;
}
	public static void main(String[] args) {
	Ex3 e=new Ex3();
	System.out.println(e.example("wipro"));
}
}
