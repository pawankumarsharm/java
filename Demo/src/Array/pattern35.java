package Array;

import java.util.Scanner;

public class pattern35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
	}

}
 /*     1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5   */
