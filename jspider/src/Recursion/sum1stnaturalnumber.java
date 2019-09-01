package Recursion;

public class sum1stnaturalnumber {
static int sumofN(int n)
{
	if(n==0)
		return 0;
	return n+sumofN(n-1);
}
	public static void main(String[] args) {
		System.out.println("mms");
		int s=sumofN(5);
		System.out.println(s);
		System.out.println("mmf");
	}

}
