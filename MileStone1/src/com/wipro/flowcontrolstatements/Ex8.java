package com.wipro.flowcontrolstatements;

public class Ex8 {
public static void main(String[] args) {
	char c=args[0].charAt(0);
	switch(c) {
	case 'r': System.out.println("r->red");
	break;
	case 'b': System.out.println("b->blue");
	break;
	case 'g': System.out.println("g->green");
	break;
	case 'o': System.out.println("o->orange");
	break;
	case 'y': System.out.println("y->yellow");
	break;
	case 'w': System.out.println("w->white");
	break;
	default: System.out.println("invalid");
	break;
	
	}
}

	
}
