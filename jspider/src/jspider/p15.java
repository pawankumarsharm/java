package jspider;

import java.util.Scanner;

public class p15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	int k=1;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+k%2);
				k++;
			}
			System.out.println();
		}	
				/*  1
					01
					010
					1010
					10101*/
	}

}
