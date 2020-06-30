package com.wipro.strings;

public class Ex10 {
public String repetation(String str,int n) {
	String w="";
	String x="";
	w=w+str.substring(n-1);
	for(int i=0;i<n;i++) {
		x=x+w;
	}
	return x;
}
public static void main(String[] args) {
	Ex10 e=new Ex10();
	System.out.println(e.repetation("wipro",3));
}
}
