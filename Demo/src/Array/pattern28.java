package Array;

import java.util.Scanner;

public class pattern28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
			if(i+j>n-1)
		
			System.out.print(i);
			else
				System.out.print(" ");
			
		}
		System.out.println();
	}
	}
/*    1
     22
    333
   4444
  55555  */

	}


