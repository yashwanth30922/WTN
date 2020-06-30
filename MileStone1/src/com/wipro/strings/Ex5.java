package com.wipro.strings;

public class Ex5 {
public String firstLast(String str) {
	int x=str.length();
	return str.substring(1,x-1);
}
public static void main(String[] args) {
	Ex5 e=new Ex5();
	System.out.println(e.firstLast("yashwanth"));
}
}
