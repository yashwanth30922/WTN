package com.wipro.Arrays;

public class Ex3 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int a[]= {1,2,3,4,5},i;
	for(i=0;i<a.length;i++) {
		if(a[i]==n) {
			System.out.println(i);
			break;
		}
		else {
			System.out.println("-1");
			break;
		}
	}
	

}
}
