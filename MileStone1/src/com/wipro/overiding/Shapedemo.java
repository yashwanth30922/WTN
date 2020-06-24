package com.wipro.overiding;
class Shape{
	void draw() {
		System.out.println("drawing shape");
	}
	void erase() {
		System.out.println("erasing shape");
	}
}
class Circle{
	void draw() {
		System.out.println("drawing circle shape");
	}
	void erase() {
		System.out.println("erasing circle shape");
	}
}
class Traingle{
	void draw() {
		System.out.println("drawing traingle shape");
	}
	void erase() {
		System.out.println("erasing traingle shape");
	}
}
class Square{
	void draw() {
		System.out.println("drawing square shape");
	}
	void erase() {
		System.out.println("erasing square shape");
	}
}
public class Shapedemo {
public static void main(String[] args) {
	Circle c=new Circle();
	Traingle t=new Traingle();
	Square sq=new Square();
	c.draw();
	c.erase();
	t.draw();
	t.erase();
	sq.draw();
	sq.erase();
	
}
}
