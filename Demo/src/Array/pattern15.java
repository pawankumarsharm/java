package Array;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(i+64)+" ");
		}
		System.out.println();
		//A
        //B B
        //C C C
        //D D D D
        //E E E E E
	}
	}

}
