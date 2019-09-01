package String;

import java.util.Scanner;

public class IsPanagrame {

	
		static boolean IsPanagram(String str)
		{
			char[] ch=str.toCharArray();
			int count[]=new int[26];
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>=65&&ch[i]<=90)
					count[ch[i]-65]++;
						
				if(ch[i]>=97&&ch[i]<=122)
					count[ch[i]-97]++;
			}
			for(int i=0;i<count.length;i++)
			{
				if(count[i]==0)
					return false;
			}
			return true;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the sentence");
			String str=sc.nextLine();
			
			boolean rs=IsPanagram(str);
			if(rs)
				System.out.println("it is a programme");
			else
				System.out.println("it is not a programme");
	}

}
