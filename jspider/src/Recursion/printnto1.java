package Recursion;

public class printnto1 {
	static void display(int n)
	{
		System.out.println(n);
		if(n>1)
			display(n-1);
	}
	public static void main(String[] args) {
		System.out.println("mms");
		display(5);
		System.out.println("mmf");
	}

}
