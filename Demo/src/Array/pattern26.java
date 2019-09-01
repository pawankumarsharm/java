package Array;

import java.util.Scanner;

public class pattern26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
			if(i<=j)
		
			System.out.print((char)(j+64));
			else
				System.out.print(" ");
			
		}
		System.out.println();
	}
	/*	 ABCDE
		  BCDE
		   CDE
		    DE
		     E    */
}
}