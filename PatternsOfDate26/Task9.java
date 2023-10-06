package com.in.PatternsOfDate26;

//import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) 
	{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the n = ");
//		 int n = scan.nextInt();
//		 for(int i=1;i<=5;i++)
		for(int i=1;i<=4;i++)
		 {
//			 for(int j=1;j<=9;j++)
			for(int j=1;j<=7;j++)
			 {
				 if(j>=(5-i) && j<=(i+3))
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println(" ");
		 }
	 		

	}

}
