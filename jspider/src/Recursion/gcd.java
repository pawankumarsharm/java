package Recursion;

public class gcd {
	static int gcd(int m,int n)
	{
		if(n>m)
			return gcd(n,m);
		if(m%n==0)
			return n;
		return gcd(n,m%n);
	}
	public static void main(String[] args) {
		int p=gcd(6,9);
			System.out.println(p);
	}

}
