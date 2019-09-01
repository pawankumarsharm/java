package String;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		
		int vc=0,cc=0,dc=0,splc=0,uc=0,lc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90)
			{
				uc++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
						vc++;
				else
					cc++;
			}
			else if(ch>=97&&ch<=122)
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
			else if(ch>=48&&ch<=57)
				dc++;
			else
				splc++;
		}
		System.out.println("vowel count"+vc);
		System.out.println("consonant count"+cc);
		System.out.println("digit count"+dc);
		System.out.println("capital letter count"+uc);
		System.out.println("small letter count"+lc);
		System.out.println("special character count"+splc);
	}

}
