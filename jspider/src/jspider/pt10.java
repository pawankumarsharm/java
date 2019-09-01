package jspider;

import java.util.Scanner;

public class pt10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			k=i;
			for(int j=1;j<=n;j++)
			{
				if((i+j)>n) {
				System.out.print(k);
				k--;
				}
				else {
					System.out.print(" ");
					
				}
				}
			System.out.println();
			}
			/*
			     1
                21
               321
              4321
             54321
			 */
		}

	}


