package com.in.PatternsOfDate26;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n = ");
		 int n = scan.nextInt();
		 for(int i=1;i<=n-1;i++)
		 {
			 for(int j=1;j<=n;j++)
			 {
				 if(i+j<=6)
				 {
					 System.out.print((char)(64+i));
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println(" ");
		 }
		 scan.close();
			 }
		 
	}
