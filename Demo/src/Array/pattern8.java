package Array;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
		{
					System.out.print(j%2 +" ");
		}
		System.out.println();/*1
                               1 0
                               1 0 1
                               1 0 1 0
                               1 0 1 0 1*/
	}

	}

}
