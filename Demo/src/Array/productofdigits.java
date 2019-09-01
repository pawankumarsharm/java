package Array;

import java.util.Scanner;

public class productofdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");//123=6.
		int n=sc.nextInt();//123//12//1//0
		int pro=1;
		while(n!=0)
		{
			int r=n%10;//123%10==3//12%10==2//1%10=1
			pro=pro*r;//1*3=3//3*2=6//6*1=6
			n=n/10;//123/10=12//12/10=1//1/10=0
			
		}
		System.out.println("products of digits:"+pro);
	}

}
