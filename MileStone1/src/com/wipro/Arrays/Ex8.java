package com.wipro.Arrays;

public class Ex8 {
public static void main(String[] args) {
	int[] n = {10,3,6,1,2,7,9};
	 int sum = 0,c=0;    
	 for(int i=0;i<n.length-1;i++){
	     if(n[i]==6){
	         for(int j=n.length-1;j>=0;j--){
	             if(n[j]==7)
	             break;
	             c=c+n[j];
	         }
	         break;
	      }
	     sum=sum+n[i];
	  }
	 System.out.println(c+sum); 
	 }
}

