package Array;

import java.util.Scanner;

public class pattern20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(j+96)+" ");
			
		}
		System.out.println();
		//a b c d e
        //a b c d
        //a b c
        //a b
        //a
	}
	}

}
