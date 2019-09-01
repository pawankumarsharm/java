package Recursion;

public class power {
	static int pow(int n,int p)
	{
		if(p==0)
			return 1;
	return n*pow(n,p-1);
	}
	public static void main(String[] args) {
		int p=pow(5,3);
		System.out.println(p);
	}

}
