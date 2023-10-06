package com.in.PatternsOfDate26;

//import java.util.Scanner;

public class Task10 {

	public static void main(String[] args)
	{
//		Scanner scan = new Scanner(System.in);
//		System.out.println(" enter the n = ");
//		int n = scan.nextInt();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
//				if((i-j<=0) && (i+j>=8))
				if(j>=i && j<=8-i)
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
