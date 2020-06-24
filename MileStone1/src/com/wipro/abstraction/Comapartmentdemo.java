package com.wipro.abstraction;

import java.util.Random;

abstract class Compartment{
abstract public void notice();
}
class firstclass extends Compartment {
	public void notice() {
		System.out.println("First class compartment");
		}
	}
class ladies extends Compartment {
	public void notice() {
		System.out.println("Reserved for ladies");
		}
	}
class general extends Compartment {
	public void notice() { 
		System.out.println("anyone can sit");
}
}class luggage extends Compartment {
	public void notice() {
		System.out.println("Compartment for luggages");
		}
	}
public class Comapartmentdemo{
	public static void main(String [] args) { 
		Compartment com[]=new Compartment[10];
		Random r=new Random();
		int n=0;
		for(int i=0;i<10;i++) {
			n=r.nextInt(4);
			if(n==0)
				com[i]=new firstclass();
			else if(n==1)
				com[i]=new ladies();
			else if(n==2)
				com[i]=new general();
			else 
				com[i]=new luggage();
			com[i].notice();
			System.out.println();
			} 
		}

}
