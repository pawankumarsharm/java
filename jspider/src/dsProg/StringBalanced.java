package dsProg;

import java.util.Scanner;
import java.util.Stack;

public class StringBalanced {
static boolean isbalanced(String str)
{
	if(str.length()%2==1)
		return false;
	char ch[]=str.toCharArray();
	
	Stack<Character> stk=new Stack<Character>();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='{'||ch[i]=='('||ch[i]=='[')
			stk.push(ch[i]);
		else
		{
			if(stk.isEmpty())
				return false;

			char pch=stk.pop();
			switch(ch[i])
			{
				case '}' : if(pch!='(')
					return false;
				case ']' : if(pch!='[')
					return false;
				case ')' : if(pch!='{')
					return false;
			}
	
		}
	}
	return stk.isEmpty();
}
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		boolean rs=isbalanced(st);
		if(rs)
			System.out.println("balanced");
		else
			System.out.println("not balanced");
		
	}

}
