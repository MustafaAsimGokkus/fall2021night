package day05nestedifandternary;

import java.util.Scanner;

public class IfElse01 {

	/*
	 
	 Type a java code by using if-else statement.Write a program to check if a year is leap or not
	 If the year is divisible by 100 then it must be divisible by 400 ==>1600 is leap, but 1700 is not
	 If the year is not divisible by 100 then it must be divisible by 4
	 
	 */
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);	
		
	System.out.println("Please enter a year");	
	int year = scan.nextInt();
	
	
	if(year%100==0 && year%400==0)
		
		System.out.println("The year is a leap year");
	} else if (year%4==0) {
		
		System.out.println("The year is a leap year");
		
	}else ("Enter the year corre")
	}

}
