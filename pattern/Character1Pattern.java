package com.in.pattern;

import java.util.Scanner;

public class Character1Pattern {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		 int n = scan.nextInt();
		 character1Pattern(n);
		 scan.close();
	}

	private static void character1Pattern(int n)
	{
		//for(int i=5;i>=1;i--)
		for(int i=1;i<=n;i++)
		{
			//for(int j=1;j<=n;j++)
			for(int j=5;j>=1;j--)
			{
		//System.out.print((char)(64+i)+" ");
				System.out.print((char)(64+j)+" ");
			}
			System.out.println(" ");
		}
			
	}

}
