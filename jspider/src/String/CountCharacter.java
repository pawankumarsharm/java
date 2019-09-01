package String;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the sentence");
			String str=sc.nextLine();
			char[] ch=str.toCharArray();
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				{
					String w=" ";
					while(i<ch.length&&ch[i]!=' ')
					{
						w=w+ch[i];
						i++;
					}
					if(w.length()>0)
						System.out.println(w+" =>"+w.length());
					
				}
	}

}
}
