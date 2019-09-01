package jspider;

import java.util.Scanner;

public class pt12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			
				System.out.print(k);
				k++;
				if(k==10)
					k=1;
				/*we can also write like that
				 * k=0
				 * sop(k%9+1+" ");
				 k++;
				 */
			}
			System.out.println();
		}	
		/*
		 1
         23
         456
         7891
         23456

		 */

	}

}
