package Recursion;

public class perfectnumber {
	static boolean isperfect(int n,int sum,int i)
	{
		if(i>n/2)
			return sum==n;
		if(n%i==0)
			sum=sum+i;
		return isperfect(n,sum,i+1);
	}
	public static void main(String[] args) {
		perfectnumber is=new perfectnumber();
		boolean rs=isperfect(8,0,1);
		if(rs)
			System.out.println("it is a perfect number");
		else
			System.out.println("it is not a perfect number");
	}

}
