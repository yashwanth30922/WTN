package com.wipro.wrapperclasses;

import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	String bin=String.format("%8s",Integer.toBinaryString(x)).replace(" ","0");
	
	System.out.println(bin);
}
}
