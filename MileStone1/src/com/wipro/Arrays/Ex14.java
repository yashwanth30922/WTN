package com.wipro.Arrays;

public class Ex14 {
	public static void main(String[] args) {
		   
	    int a=args.length;
	    int i;
	    int arr[][] = new int[6][6];
	   
	        int k=0;
	    for(i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            
	        arr[i][j]=Integer.parseInt(args[k]);
	        k++;
	        }
	        
	    }
	    int max=arr[0][0];
	    for(i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	        	if(arr[i][j]>max) {
	        		max=arr[i][j];
	        }
	    }
	        }
	    System.out.println(max);
}
}
