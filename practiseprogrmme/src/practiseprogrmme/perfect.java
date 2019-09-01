package practiseprogrmme;

import java.util.Scanner;

public class perfect {//it is the +ve integer that is equal to its proper devisers excluding the no. itself.ex:-28->1,2,4,7,14->1+2+4+7+14=28

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");//6
		int n=sc.nextInt();
		int sum=0,t=n;
		for(int i=1;i<=n/2;i++)//n=3,i=1,i=2,i=3
		{
			if(n%i==0)
			{
				sum=sum+i;//1,3,6
			}
		}
		if(sum==t)
			System.out.println("the number is perfect"+t);
		else
			System.out.println("the number is not perfect"+t);
	}

}
