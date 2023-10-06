package com.in.pattern;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n=scan.nextInt();
		numberPattern(n);
		scan.close();
	}

	private static void numberPattern(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				//System.out.print(i+" ");
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
