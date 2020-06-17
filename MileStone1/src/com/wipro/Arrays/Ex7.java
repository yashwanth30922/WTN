package com.wipro.Arrays;

public class Ex7 {
public static void main(String[] args) {
	int a[]= {1,2,2,3,4,5};
	int n=a.length;
	int i,j;
	int c[]=new int[n];
	for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			if(a[i]==a[j]) {
				a[j]=a[n-1];
				n--;
				j--;
			}
		}
	}
	for(i=0;i<n;i++) {
		System.out.println(a[i]);
	}
}
}
