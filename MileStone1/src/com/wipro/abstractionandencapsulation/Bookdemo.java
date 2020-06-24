package com.wipro.abstractionandencapsulation;
class Author{
	static String email,name;
	static char gender;
	Author(String n,String e,char g){
		email=e;
		name=n;
		gender=g;
	}
}
class Book{
	 String nam,author;
	double price;
	int quantity;
	Book(String n1){
		this.nam=n1;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
     void getAuthor() {
		System.out.println("author name is"+" " +Author.name);
		System.out.println("author mail is"+" " +Author.email);
		System.out.println("author gender is"+" " +Author.gender);
	}
     String getName() {
    	 return nam;
     }
	
}
public class Bookdemo {
	public static void main(String[] args) {
		Author a=new Author("yash","tillu592@gmail.com",'m');
		Book b=new Book("java");
		b.setPrice(100);
		b.setQuantity(2);
		System.out.println("book name is:"+" "+b.getName());
		System.out.println("book price is:"+" "+b.getPrice());
		System.out.println("book quantity is:"+" "+b.getQuantity());
		b.getAuthor();
		
	}

}
