package com.wipro.wrapperclasses;

class Employ {
String name;
int id;
Employ(){
	name="yashwanth";
	id=30922;
}
}
public class Employee{
public static void main(String[] args) {
	Employ e=new Employ();
	System.out.println("Employee name is"+" "+e.name+" "+"id is"+" "+e.id);
	Employ e1=e;
	e1.name="yash";
	System.out.println("Employee name is"+" "+e.name+" "+"id is"+" "+e.id);
}
}


