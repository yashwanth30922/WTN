package wipro.com.inheritence;
class Animal{
	 public void sleep() {
	        System.out.println("An animal sleeps");
	    }
	     
	    public void eat() {
	        System.out.println("An animal eats");
	    }
}
class Bird extends Animal{
	public void sleep() {
        System.out.println("An bird sleeps");
    }
     
    public void eat() {
        System.out.println("An bird eats");
    }
    public void fly() {
        System.out.println("An bird eats");
    }
}
public class Animaldemo {
public static void main(String[] args) {
	Animal a=new Animal();
	Bird b=new Bird();
	System.out.println();
	a.eat();
	a.sleep();
	b.eat();
	b.sleep();
	b.fly();
}
}
