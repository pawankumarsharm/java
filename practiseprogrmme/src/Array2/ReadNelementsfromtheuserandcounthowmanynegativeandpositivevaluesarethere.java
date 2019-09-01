package Array2;

import java.util.Scanner;

public class ReadNelementsfromtheuserandcounthowmanynegativeandpositivevaluesarethere {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");//5
		int n=sc.nextInt();
		int ar[]=new int[n];
		int p=0,neg=0;
		System.out.println("enter "+n+" elements:");//enter 5 elements
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();//1 -2 -4 5 7
		}
		for (int j = 0; j < ar.length; j++) {
			if(ar[j]<0)
			neg++;
			else
				p++;
		}
		System.out.println("the total positive elements are"+p+ "the total negative numbers are"+neg);//2
	}

}
