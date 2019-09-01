package practiseprogrmme;

import java.util.Scanner;

public class strong {//if the sum of factorial of each digit is equal to the given number,it is called strong no. ex:-145->1!+4!+5!=1+24+120=145

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();//145,14,1
		int sum=0,t=x;
		do {
			int r=x%10;//5,4,1
			int f=1;
			while(r>1)//5,4,3,2,1//4,3,2,1
			{
				f=f*r;//5,20,60,120//4,12,24
				r--;//4,3,2,1//3,2,1
			}
			sum=sum+f;//120,120+24=144,144+1=145
			x=x/10;//14,1
		}
		while(x!=0);
		if(sum==t)
			System.out.println("the number is Strong"+t);
		else
			System.out.println("the number is not strong"+t);
	}

}
