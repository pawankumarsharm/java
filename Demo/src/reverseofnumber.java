import java.util.Scanner;

public class reverseofnumber {
	static int reverseofnumber(int x)
	{
		int rev=0;
		while(x!=0)
		{
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
		return rev;

}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int b=reverseofnumber(n);//345
		System.out.println("reverse of number"+b);
	}
}
