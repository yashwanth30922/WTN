package com.wipro.strings;

public class Ex2 {
	public String conCat(String s1,String s2) {
	if(s1.length()!=0 && s2.length()!=0 && s1.charAt(s1.length()-1)==s2.charAt(0)) {
		return s1+s2.substring(1);
	}
	else {
		return s1+s2;
	}
	}

public static void main(String[] args) {
	Ex2 e=new Ex2();
	String s1="yash";
	String s2="hash";
	System.out.println(e.conCat(s1,s2));
}
}
