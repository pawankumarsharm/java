package Array;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
		//A
        //A B
        //A B C
        //A B C D
        //A B C D E
	}

}}
