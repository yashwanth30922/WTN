package com.wipro.classes_objects;
class Box {
double l,b,h;
Box(double l,double b,double h){
	this.l=l;
	this.b=b;
	this.h=h;
}
double volume() {
	return l*b*h;
}
}
public class BoxSolution {
public static void main(String[] args) {
Box b =new Box(2,3,5);
System.out.println(b.volume());
}
}
