package Recursion;

public class print1ton {
	static void print(int n)
	{
		if(n>1)
			print(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		System.out.println("mms");
		print(5);
		System.out.println("mmf");
	}

}
