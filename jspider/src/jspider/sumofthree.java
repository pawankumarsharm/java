package jspider;
import java.util.*;
public class sumofthree {

	
		static int numberofdigits(int n)//3569 
		{
			int sum=0;
			while(n!=0) {
				int d=n%10;//3
				sum=sum+d;//23
				n=n/10;//10
			}
			return sum;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=in.nextInt();//3569
	int b=numberofdigits(a);
	System.out.println(b);
		}

	}
