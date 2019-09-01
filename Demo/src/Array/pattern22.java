package Array;

import java.util.Scanner;

public class pattern22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		for(int j=1;j<=n;j++)
		{
			System.out.print((char)(j+96)+" ");
		}
		System.out.println(); /*a b c d e
		                        a b c d e
		                        a b c d e
		                        a b c d e*/
	}

}
}