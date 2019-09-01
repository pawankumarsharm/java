package Recursion;

public class isprime {
	public boolean isPrime(int n,int i)
	{
		if(i>n/2) {
			return true;
		}
		if(n%i==0) {
			return false;
		}
		return isPrime(n,i+1);
	}
	public static void main(String[] args) {
		isprime is=new isprime();
		boolean rs=is.isPrime(9,2);
		if(rs)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}

}
