package com.wipro.strings;

public class Ex4 {
	public String even(String str) {
		if(str.length()%2==0) {
			return str.substring(0,str.length()/2);
		}
		else {
			return null;
		}
	}
public static void main(String[] args) {
	Ex4 e=new Ex4();
	System.out.println(e.even("tomcat"));
}
}
