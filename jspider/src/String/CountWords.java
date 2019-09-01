package String;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			count++;
	}
		System.out.println("no. of words:"+count);
}
}