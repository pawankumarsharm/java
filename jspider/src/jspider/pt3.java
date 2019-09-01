package jspider;

import java.util.Scanner;

public class pt3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		/*for(int i=n;i>0;i--)
		{we can also use this formula
			for(int j=1;j<=i;j++)
			{*/
		/*for(int i=1;i<=n;i++)
		{this formula also can be used
			for(int j=1;j<=n-i+1;j++)
			{*/
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
//	    * * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
	}

}
