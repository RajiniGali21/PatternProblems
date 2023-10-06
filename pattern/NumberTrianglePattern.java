package com.in.pattern;

import java.util.Scanner;

public class NumberTrianglePattern {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		numberTrianglePattern(n);
		scan.close();
	}

	private static void numberTrianglePattern(int n)
	{
		//for(int i=1;i<=n;i++)
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			//for(int j=5;j>=i;j--)
			{
				System.out.print(i+" ");
				//System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
