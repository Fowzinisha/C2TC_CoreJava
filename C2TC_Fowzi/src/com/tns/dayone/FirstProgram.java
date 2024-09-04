package com.tns.dayone;

public class FirstProgram {

	public static void main(String[] args) {
		int a=20;  
		int b=6;  
		
		//Arithmetic Operator
		System.out.println("Arithmetic Operator");
		System.out.println(a+b);  
		System.out.println(a-b); 
		System.out.println(a*b); 
		System.out.println(a/b);
		System.out.println(a%b);
				
		// Unary operators
		int x=10;  
		System.out.println("Unary Operators");
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		//Left Shift Operator
		System.out.println("Left Shift Operator");
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		
		//Right Shift Operator 
		System.out.println("Right Shift Operator ");
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
		

		//TernoryOperator
		int c=2;  
		int d=5;  
		int min=(c<d)?c:d; 
		System.out.println("Ternory Operator ");
		System.out.println(min); 
		
		//Assignment Operator
		int g = 10;  
		int h = 20;  

		g += 4; // g = g + 4 (g = 10 + 4)  
		h -= 4; // h = h - 4 (h = 20 - 4) 
		
		System.out.println("Assignment Operator");
		System.out.println(g); // Output: 14  
		System.out.println(h); // Output: 16  

	 
	}

}
