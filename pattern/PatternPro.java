package com.in.pattern;

import java.util.Scanner;

public class PatternPro {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number = ");
		int n = scan.nextInt();
		printPaattern(n);
		scan.close();
		
	}

	private static void printPaattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=6)
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
