package Recursion;

public class fibonacci {
	static int fib(int n)
	{
	if(n==1)
		return 0;
	if(n==2)
		return 1;
	return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		System.out.println("mms");
		int f=fib(7);
		System.out.println(f);
		System.out.println("mmf");
	}

}
