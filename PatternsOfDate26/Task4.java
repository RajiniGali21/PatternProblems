package com.in.PatternsOfDate26;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the n = ");
		 int n = scan.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=n;j++)
			 {
				 if(i<=j)
				 {
					 System.out.print(i);
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println(" ");
			 scan.close();
	}

}
}
