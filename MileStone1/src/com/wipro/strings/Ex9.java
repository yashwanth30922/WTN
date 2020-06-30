package com.wipro.strings;

public class Ex9 {
public static void main(String[] args) {
	String a="hello";
	String b="world";
	int i,j;
	String x="";
	for(i=0,j=0;i<a.length();i++,j++) {
		x=x+a.charAt(i)+b.charAt(j);
	}
System.out.println(x);
}

}
