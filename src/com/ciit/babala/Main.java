package com.ciit.babala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		
		int floor;
		char letter = ' ';
		
		String [] Passengers = new String [10];
		LinkedList<String> RecordBook = new LinkedList<String>();
		
		do {  
			
			System.out.println("Hi welcome to Dummy Elevator! "); 
			System.out.println ("Please select an option below: ");
			System.out.println ("r > recordbook ");
			System.out.println ("e > elevator ");
			letter = reader.readLine().charAt(0);
			
		
			 switch (letter) {
				case 'r':
					System.out.println  ("This is the recordbook: ");
					for (String i: RecordBook)  {
						System.out.println(i);							
					}
					break;
				case 'e':	
			 
			
			Passengers = new String [10];
		for (int i = 0; i < 10; i++) {
			System.out.println("What is your name?: ");
			Passengers [i] = reader.readLine();
			RecordBook.add(Passengers [i]);
			System.out.println("Which floor are you going to?: ");
			floor = Integer.parseInt(reader.readLine());
		}
		
		if (Passengers != null) {
			System.out.println("ELEVATOR IS NOW FULL! ");
			System.out.println("NOW UNLOADING...... ");
		}
		
		for (int i = 0; i < Passengers.length; i++) {
			System.out.println(Passengers[i]);
		
		}
		
		Passengers = null;

		if (Passengers == null) {
			System.out.println("NOW TAKING PASSENGERS!");
			
		}
			 	    		

		
			 }
	
		
		 
		}
		
		while (Passengers == null);
		System.out.println("ERROR ERROR ERROR");
		
		
	}
	
}
	

	

