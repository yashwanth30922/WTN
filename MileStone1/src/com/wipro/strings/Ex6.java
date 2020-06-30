package com.wipro.strings;

public class Ex6 {
public String shortLong(String a,String b) {
int x=a.length();
int y=b.length();
if(x<y) {
	return a+b+a;
}
else {
	return b+a+b;
}
}
public static void main(String[] args) {
	Ex6 e=new Ex6();
	System.out.println(e.shortLong("hi","hello"));
}
}
