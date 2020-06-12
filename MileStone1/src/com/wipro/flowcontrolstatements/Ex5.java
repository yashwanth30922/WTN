package com.wipro.flowcontrolstatements;

public class Ex5 {
public static void main(String[] args) {
	char ch='@';
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
				System.out.println("Alphabet");
			}
			else if(ch>=48 && ch<=57) {
				System.out.println("Digit");
			}
			else {
				System.out.println("Special characters");
			}
}
}
