package Array;

import java.util.Scanner;

public class pattern17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of stars");
		int n=sc.nextInt();
	int a=1;
		
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(a+64)+" ");
			a++;
			
		}
		System.out.println();
	}   //A
        //B C
        //D E F
        //G H I J
        //K L M N O

}
}