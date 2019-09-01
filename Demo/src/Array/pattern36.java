package Array;

import java.util.Scanner;

public class pattern36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
		for (int i = n; i > 0; i--)
        {
            for (int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
            	
                System.out.print(k+"");
                if(k<i)
                	System.out.print("*");
                
            }
            System.out.println();
        }
	}

}
//1*2*3*4*5
// 1*2*3*4
 // 1*2*3
 //  1*2
  //  1
