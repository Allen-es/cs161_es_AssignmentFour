package edu.cgcc.cs161;

//HEADER
//Program Name: Week 4 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/31/2021
//Description: This problem involves using the while loop to find the sum of the values.

public class ProblemThree {

	/*PSEUDOCODE
	 *  Program Start
	 *  y variable equals 1
	 *  x variable equals 11
	 *  myNum variable equals 0 
	 *  For the time that y is less that x
	 *  	Add myNum with y
	 *  	Increment y by 1 until y equals 10
	 *  Print out an equals sign for each number and myNum 
	 *  Program End
	 */ 
	public static void main(String[] args) {
		
		int y=1;
		int x=11;
		int myNum=0;
		while(y<x) {
			
			myNum += y;
			y++;
			System.out.print("="+myNum);
			
		}
	}
}
/*FOOTER
 * =1=3=6=10=15=21=28=36=45=55
 */
