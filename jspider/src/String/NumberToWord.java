package String;

import java.util.Scanner;

public class NumberToWord {
	
	static void nTow(int n,String st)
	{
		String one[]= {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String two[]= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		if(n<20)
		System.out.println(one[n]);
		else
			System.out.println(two[n/10]+one[n%10]);
		if(n!=0)
			System.out.println(st+" ");
	}
	static public void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int no=sc.nextInt();
			nTow(no/10000000,"crore");
			nTow(no/100000%100,"lakh");
			nTow(no/1000%100,"thousand");
			nTow(no/100%10,"hundred");
			nTow(no/10000000," ");
	}

}
