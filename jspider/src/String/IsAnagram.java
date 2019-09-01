package String;

import java.util.Scanner;

public class IsAnagram {

	static int[] countAlpha(String str)
	{
		char[] ch=str.toCharArray();
		int count[]=new int[26];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				count[ch[i]-65]++;
					
			if(ch[i]>='a'&&ch[i]<='z')
				count[ch[i]-97]++;
		}
		return count;
	}
	static boolean IsAnagram(String s1,String s2)
	{
		int c1[]=countAlpha(s1);
		int c2[]=countAlpha(s2);
		for(int i=0;i<26;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first sentence");
		String str=sc.nextLine();
		System.out.println("enter the second sentence");
		String str2=sc.nextLine();
		
		boolean rs=IsAnagram(str,str2);
		if(rs)
			System.out.println("it is a Anagramme");
		else
			System.out.println("it is not a Anagramme");
	}

}
