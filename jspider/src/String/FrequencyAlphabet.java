package String;

import java.util.Scanner;

public class FrequencyAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int count[]=new int[128];
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
				count[ch[i]-65]++;
					
			if(ch[i]>=97&&ch[i]<=122)
				count[ch[i]-97]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)(i+65)+"=>"+count[i]);
	}
	}
}
