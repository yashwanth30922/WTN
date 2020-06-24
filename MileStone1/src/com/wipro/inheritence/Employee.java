package com.wipro.inheritence;
public class Employee extends Person {
private double salary;
private int year;
private String insurance;
Employee(String name,double s,int y,String i){
	super(name);
	this.salary=s;
	this.year=y;
	this.insurance=i;
	
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getInsurance() {
	return insurance;
}
public void setInsurance(String insurance) {
	this.insurance = insurance;
}
public void display() {
	System.out.println("name is "+super.getNameOfPerson()+" "+"salary is"+salary+" "+"insurance number is"+insurance);
}

}
