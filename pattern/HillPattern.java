package com.in.pattern;

import java.util.Scanner;

public class HillPattern {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
//				if(i+j>=4 && j-i<=2)
				if(i<=j && i+j<=6)
//				if(i+j>=2 && i*j<10)
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
