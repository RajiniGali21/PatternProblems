package com.in.pattern;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("entre the n = ");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=n;j++)
			{
				if(i+j>=4 && j-i<=2)
			
			{
				System.out.print((char)(65+i));
			}
				else
				{
			System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=n;j++ )
			{
				if(i+j>=2 && i*j<10) 
				{
					
				
				System.out.print((char)(65+i));
			}
				else
				{
				
			System.out.print(" ");
				}
				
			}
			scan.close();
		}
	}

}
