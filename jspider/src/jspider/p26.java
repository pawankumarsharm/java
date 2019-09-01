package jspider;

import java.util.Scanner;

public class p26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int p=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
				for(int k=1;k<2*i;k++) {
					
				
				 System.out.print(p+"*");
				 p++;
				}
			System.out.println();
		}

	}
	//     1*
	 //   2*3*4*
	 //  5*6*7*8*9*
	 // 10*11*12*13*14*15*16*
	// 17*18*19*20*21*22*23*24*25* 
}
