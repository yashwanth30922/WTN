package com.wipro.Arrays;

public class Ex1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int i,sum=0;
	float avg=0;
	for(i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	avg=(float)sum/a.length;
	System.out.println("sum is "+sum+ " average is "+avg);
}
}
