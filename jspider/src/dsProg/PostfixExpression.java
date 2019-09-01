package dsProg;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the postfix expression...");
		String st=sc.next();
		Stack<Double> sk=new Stack<Double>();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=65&&ch<=90||ch>=97&&ch<=122)
			{
				System.out.println("enter the value of "+ch);
				double v=sc.nextDouble();
				sk.push(v);
			}
			 else
			{
				double x=sk.pop();
				double y=sk.pop();
				switch(ch)
				{
				case '+': sk.push(y+x);
				break;
				case '-': sk.push(y-x);
				break;
				case '*': sk.push(y*x);
				break;
				case '/': sk.push(y/x);
				break;
				case '%': sk.push(y%x);
				break;

				
				}
				
			}
		}
		System.out.println("Evaluate value is: "+sk.pop());
	}

}
