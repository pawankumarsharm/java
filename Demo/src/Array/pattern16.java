package Array;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(i+96)+" ");
		}
		System.out.println();
		//a
        //b b
        //c c c
        //d d d d
        //e e e e e
	}
	}

}
