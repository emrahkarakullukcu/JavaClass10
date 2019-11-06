package com.class10;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		char [] grades = new char[6];
		
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		
		System.out.println(grades[1]);
		
		String [] group = new String[3];
		group[0] = "Emrah";
		group[1] = "Beyza";
		group[2] = "Seda";
		
		System.out.println(group[0]);
		String [] group2 = {"Emrah" ,"Beyza","Seda"};
		System.out.println(group2[2]);
		
		String[] array = new String[5];
		array[0] = " Java";
		array[1] = "Saturday";
		array[2] = " day";
		array[3] = " coding";
		array[4] = " is";
		System.out.println(array[1] + array[4] + array[0] + array[3] + array[2]);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number that represent your list's size ");
		int number =scan.nextInt();
		
		int [] arrayUser = new int [number];
		int sum =0;
		
		for (int i=0; i<arrayUser.length;i++) {
			System.out.println("please enter " + (i+1) +". element of your list.");
			arrayUser[i] = scan.nextInt();
			sum += arrayUser[i];
		}
		System.out.println();
		System.out.print("Your array is [");
		for(int i =0; i<arrayUser.length;i++) {
			if(i==arrayUser.length-1) {
				System.out.print(arrayUser[i] + "]");
			}else {
				System.out.print(arrayUser[i] + " ;");	
			}
			
			
		}
		System.out.println();
		
		System.out.println("Sum of the numbers in your list = " + sum);
		double avg = (double)sum/arrayUser.length;
		System.out.println("Average of the numbers in your list = " + avg);
		
		System.out.println("**********************************");
		String[] animals = {"Cat", "Dog","Cow","Snake","Elephant"};
		int size = animals.length;
		for(int i = 0; i< size; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println("\n**********************************");
		//create an array to store 5 double values, print all elements in 1 line
		double [] myDouble = {2.25,3.45,4.36,7.65,8.90};
		for(int i=0; i<myDouble.length;i++) {
			System.out.print(myDouble[i] + " ");
		}
		System.out.println();
		

	}

}
