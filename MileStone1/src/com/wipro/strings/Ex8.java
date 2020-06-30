package com.wipro.strings;

public class Ex8 {
public String star(String str) {
	String z="";
	StringBuffer sb=new StringBuffer(str);
	int i=str.indexOf("*");
	//int j=str.lastIndexOf("*");
  z=z+sb.delete(i-1,i+2);
  return z;
 
}
public static void main(String[] args) {
	Ex8 e=new Ex8();
	System.out.println(e.star("ab*cd"));
}
}
