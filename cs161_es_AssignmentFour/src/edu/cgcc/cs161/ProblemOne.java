package edu.cgcc.cs161;

//HEADER
//Program Name: Week 4 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/31/2021
//Description: This problem involves using the for, while, and do while loops to print out a series of integers. 

public class ProblemOne {
	/*PSEUDOCODE
	 *  Program Start
	 *  Print out "For: "
	 *  For a that equals 1 and is less than 11, increment by 1
	 *  Print out the values of a with a space between each value
	 *  
	 *  Print a space
	 *  Print the word "while: "
	 *  Initialize variable b equal to 1
	 *  With b being less than 11
	 *  	Print out b with a space after each value
	 *  	Increment b by 1 
	 *  
	 *  Print out a space
	 *  Print out the phrase "do...while "
	 *  Initialize n equal to 1
	 *  Execute the following
	 *  	Print out b incrementing by 1
	 *  	Print a space after each value
	 *  Until b reaches 10
	 *  Program End
	 */ 

	public static void main(String[] args) {
		
		System.out.print("for: ");
		for( int a = 1; a < 11; a++) {
			System.out.print(a+" ");
			
		}	
		
		System.out.println(" ");
		System.out.print("while: ");
		int b=1;
		
		while(b<11) {
			
			System.out.print(b+" ");
			b++;	
		}
		System.out.println(" ");		
		System.out.print("do...while: ");
		int n=1;
		do {
		System.out.print(n++);
		System.out.print(" ");
	    } while (n<11);
		
	}
}

	/*FOOTER
	 * for: 1 2 3 4 5 6 7 8 9 10  
	 * while: 1 2 3 4 5 6 7 8 9 10  
	 * do...while: 1 2 3 4 5 6 7 8 9 10 
	 */
	
			