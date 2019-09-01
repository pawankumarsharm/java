package String;

import java.util.Scanner;

public class ConvertAllTheCharacterIntoLowerCase {

	String toLowercase(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		String st=new String(ch);
		return st;
	}
	String tolowercase(String str)
	{
	 String ls="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>=65)&&(ch<=90))
			{
				ch=(char)(ch+32);
			}
		
		ls=ls+ch;
		}
		return ls;
	}

	
	public static void main(String[] args) {
		ConvertAllTheCharacterIntoLowerCase lc=new ConvertAllTheCharacterIntoLowerCase();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String sd=sc.nextLine();
		String s=lc.tolowercase(sd);
		System.out.println("enter the word");
		String sd1=sc.nextLine();
		String st=lc.tolowercase(sd1);
		System.out.println(s);
		System.out.println(st);

	}

}
