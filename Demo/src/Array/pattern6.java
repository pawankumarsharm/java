package Array;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
				if(j%2==0) {
				System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
					System.out.print(" ");
			
		}
		System.out.println();/*1 0 1 0 1
                               1 0 1 0 1
                               1 0 1 0 1
                               1 0 1 0 1
                               1 0 1 0 1*/
	}

}
}
