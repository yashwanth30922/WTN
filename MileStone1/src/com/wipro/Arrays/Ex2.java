package com.wipro.Arrays;

public class Ex2 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int min=a[0];
	int max=a[0],i;
	for(i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("max is "+max+" min is "+min);
}
}
