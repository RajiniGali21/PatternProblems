package com.in.pattern;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		characterPattern(n);
		scan.close();
	}

	private static void characterPattern(int n) 	
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				//System.out.print((char)(64+i)+" ");
				System.out.print((char)(64+j)+" ");
				
			}
			System.out.println(" ");
		}
	}

}
