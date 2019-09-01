package String;

import java.util.Scanner;

public class Frequecy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int count[]=new int[128];
		for(int i=0;i<str.length();i++)
		{
			count[ch[i]]++;
	}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)i+"=>"+count[i]);
		}
		}
}
