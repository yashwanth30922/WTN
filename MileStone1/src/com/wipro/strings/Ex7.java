package com.wipro.strings;

public class Ex7 {
public String problem(String str) {
	int g=str.length();
	if(str.charAt(0)=='x' && str.charAt(g-1)=='x' ) {
		return str.substring(1,g-1);
	}
	else {
		return str;
	}
}
public static void main(String[] args) {
	Ex7 e=new Ex7();
	System.out.println(e.problem("xyashx"));
}
}
