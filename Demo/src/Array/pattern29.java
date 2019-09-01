package Array;

import java.util.Scanner;

public class pattern29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{	
			for(int k=i;k<n*2-1;k++) {
				System.out.print(" ");
			}
			for(int l=i;l>=1;l--) {
				if(l!=n+1)
					System.out.print(l);
			}
		System.out.println();
	}
	}
/* 
     654321
      54321
       4321
        321
         21
          1 */

	}


