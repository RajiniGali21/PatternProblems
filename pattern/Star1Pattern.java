package com.in.pattern;

import java.util.Scanner;

public class Star1Pattern {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n=scan.nextInt();
		printStarPattern(n);
		scan.close();

	
	}

	private static void printStarPattern(int n)
	{
		//for(int i=1;i<=n;i++)
		for(int i=1;i<=n;i++)
		{
			//for(int j = 1 ;j<=i;j++)
			for(int j=5;j>=i;j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
			
	}

}
