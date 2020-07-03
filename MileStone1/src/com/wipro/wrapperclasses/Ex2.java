package com.wipro.wrapperclasses;

public class Ex2 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	System.out.println("given number is"+n);
	System.out.println("Binary Equivalen:"+Integer.toBinaryString(n));
	System.out.println("Hexadecimal Equivalen:"+Integer.toHexString(n));
	System.out.println("Octal Equivalen:"+Integer.toOctalString(n));
}
}
