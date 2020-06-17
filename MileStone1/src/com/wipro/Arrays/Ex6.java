package com.wipro.Arrays;

public class Ex6 {
	public static void main(String[] args) {
		int i;
		int a[]= {4,3,2,6,7,1};
		int temp;
		for(i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}

}
}
