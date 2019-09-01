package Array;

import java.util.Scanner;

public class pattern31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j<i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= 2*n-i; k++)
            {
            	
                System.out.print(k+"");
            }
            System.out.println();
        }
	}
				/*	1 2 3 4 5 6 7 8 9
					  2 3 4 5 6 7 8
					    3 4 5 6 7
					      4 5 6
					        5  */
}
