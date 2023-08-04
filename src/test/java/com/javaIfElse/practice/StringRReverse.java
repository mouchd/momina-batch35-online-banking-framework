package com.javaIfElse.practice;

public class StringRReverse {

	public static void main(String[] args) {
		String name= "United State Of America";//pool
		
		//String obj = new String("United State Of America");//Heap;;//Count==> leangth()= number
		//System.out.println(obj);
		
		//for (int i=name.length()-1; i>=0; i--);//Negative//i=Index
		//System.out.println(name.charAt(i));
		//with reverse() = String =No, SB & SB= Yes
				StringBuilder obj = new StringBuilder("United State Of America");
				System.out.println(obj.reverse());
	}
	
		
		
		
		}
		

