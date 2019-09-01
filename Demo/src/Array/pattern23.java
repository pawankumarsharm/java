package Array;

import java.util.Scanner;

public class pattern23{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		int a=1;
		for(int i=0;i<n;i++)
		{
		for(int j=1;j<=n;j++)
		{
			System.out.print((char)(a+96)+" ");
			a++;
		}
		System.out.println(); /*a b c d e
								f g h i j
	}                           k l m n o
		                        p q r s t
		                        u v w x y */

}}
}
