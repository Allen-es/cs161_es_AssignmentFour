package edu.cgcc.cs161;

//HEADER
//Program Name: Week 4 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/31/2021
//Description: This problem involves using the for loop and skipping numbers by implementing a continue.

public class ProblemTwo {
	/*PSEUDOCODE
	 *  Program Start
	 *  a variable equals 1
	 *  a cannot be bigger than 11
	 *  Increment a by 1 until 10
	 *  If a equals 4, pass over 
	 *  If a equals 7, pass over
	 *  Print out a with a space between each value of a
	 *  Program End
	 */ 

	public static void main(String[] args) {
		
		for(int a=1; a<11; a++) {
			if(a== 4) {
				continue;}
			if(a==7) {
				continue;}
		
			System.out.print(a+" ");
			}
		}
	}
/*FOOTER
 * 1 2 3 5 6 8 9 10 
 */


