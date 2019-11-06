package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		int []b;// declare an array ---> preferred way
		int c[] = {10,20};
		//int[] array = new int[4];
		
		b = new int[4]; // initialize array
		b[0] = 10;
		b[1] = 12;
		b[2] = 22;
		b[3] = 32;
		
		// access value from an array
		System.out.println(b[3]);
		System.out.println(c[0]);
		
		//lets create an array that will store classes
		//ArrayIndexOutOfBoundsException pop up when calling elements out of array bounds
		
		String[] classes = new String[4];
		
		classes[0] = "Java";
		classes[1] = "SDLC";
		classes[2] = "Manual Testing";
		classes[3] = "GIT";
		
		// Today we have Java class
		
		System.out.println("Today we have a " + classes[0] + " class");
		
		

	}

}
