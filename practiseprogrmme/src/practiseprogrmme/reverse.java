package practiseprogrmme;

import java.util.Scanner;

public class reverse {
	
	public static void main(String[] args) {
		int rev=0;
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter the nummber");
	int n=sc.nextInt();//5387
	int t=n;
	do {
		int r=n%10;//7,8,3,5
		rev=rev*10+r;//0*10+7=7,7*10+8=78,78*10+3=783,783*10+5=7835
		n=n/10;//538,53,5,0
	}
	while(n!=0);
	if(rev==t)
		System.out.println(t+"is palindrome");
	else
		System.out.println(t+"is not palindrome");
	//System.out.println(rev);//7835......reverse of a number.
	}

}
