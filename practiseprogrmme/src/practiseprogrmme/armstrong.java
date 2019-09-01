package practiseprogrmme;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//153,15,1
		int sum=0,t=n;
		do {
			int r=n%10;//3,5,1
			sum=sum+(r*r*r);//27,152,153
			n=n/10;//15,1
		}
		while(n!=0);
		if(sum==t)
			System.out.println("the number is armstrong"+t);
		else
			System.out.println("the number is not armstrong"+t);
	}

}
