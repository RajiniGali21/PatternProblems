package com.in.pattern;

import java.util.Scanner;

public class Number1Pattern {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		number1Pattern(n);
		scan.close();
	}

	private static void number1Pattern(int n) 
	{
		//for(int i=5;i>=1;i--)
			for(int i=1;i<=n;i++)
		{
			//for(int j=1;j<=n;j++)
				for(int j=5;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
