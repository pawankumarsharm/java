package Array;

import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
	int a=1;
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(a+96)+" ");
			a++;
			
		}
		System.out.println();
		//a
        //b c
        //d e f
        //g h i j
        //k l m n o
	}

}
}