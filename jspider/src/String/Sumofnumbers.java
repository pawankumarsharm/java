package String;

import java.util.Scanner;

public class Sumofnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		int sum=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			int n=0;
			while(i<ch.length&&ch[i]>=48&&ch[i]<=57)
			{
				n=n*10+(ch[i]-48);
				i++;
			}
		sum=sum+n;
		}
System.out.println(sum);
	}

}
