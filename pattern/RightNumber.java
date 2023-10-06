package com.in.pattern;

import java.util.Scanner;

public class RightNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number = ");
//		int num = 1,row=4;
//		for(int i=1;i<=row;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(num+" ");
//				num++;
//			}
//			System.out.println( );
//		}
		int n = scan.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j = 1;j<=n;j++)
			if(i+j<=6)
			{
				System.out.print(j);
			}
			else
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		scan.close();
	}
	

}
