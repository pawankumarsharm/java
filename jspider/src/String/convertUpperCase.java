package String;

import java.util.Scanner;

public class convertUpperCase {
	String toUppercase(String str)
	{
	 String ls="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>=97)&&(ch<=122))
			{
				ch=(char)(ch-32);
			}
		
		ls=ls+ch;
		}
		return ls;
	}

	
	public static void main(String[] args) {
		convertUpperCase lc=new convertUpperCase();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String sd1=sc.nextLine();
		String st=lc.toUppercase(sd1);
		System.out.println(st);
		System.out.println("the uppercase of "+sd1+"is"+st);

	}

}
