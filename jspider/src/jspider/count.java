package jspider;
import java.util.*;
public class count {
	static int numberofdigits(int n) {
		int count=1;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter the number");
int a=in.nextInt();
int b=numberofdigits(a);
System.out.println(b);
	}

}
