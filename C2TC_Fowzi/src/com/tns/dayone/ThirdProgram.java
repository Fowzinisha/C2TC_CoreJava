package com.tns.dayone;

public class ThirdProgram {

	public static void main(String[] args) {
		
		System.out.println("for Loop");
		
		for(int i=1;i<=10;i++){  
	        System.out.println(i);  
	    } 
		
		System.out.println("Nested for Loop");
		
		for(int k=1;k<=5;k++){  
			for(int n=1;n<=k;n++){  
			        System.out.print("* ");  
			}  
			System.out.println();//new line  
			}  

	}

}
