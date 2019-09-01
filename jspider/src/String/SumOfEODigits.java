package String;

import java.util.Scanner;

public class SumOfEODigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		int se=0,so=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if((ch[i]>=48)&&(ch[i]<=57));
			{
			if(ch[i]%2==0)	
			se=se+(ch[i]-48);
			else
				so=so+(ch[i]-48);
			}
		}
		System.out.println("sum of odd no="+so);
		System.out.println("sum of even no="+se);
	}

}
