package com.in.pattern;

import java.util.Scanner;

public class LeftStar {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number = ");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
//				if(i+j>5)
				if(i<=j)
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
		scan.close();
	}

}
