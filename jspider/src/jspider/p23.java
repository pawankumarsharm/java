package jspider;

import java.util.Scanner;

public class p23 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.next();
		for(int i=0;i<st.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
				
			/*  p
				p a
				p a w
				p a w a
				p a w a n */
				
		}
	}
}
