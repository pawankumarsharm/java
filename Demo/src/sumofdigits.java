import java.util.Scanner;

public class sumofdigits {
	static int sumofdigits(int x)
	{
		int sum=0;
		while(x!=0)
		{
			int r=x%10;
			sum=sum+r;
			x=x/10;
		}
		return sum;	
	}	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int b=sumofdigits(n);//345
		System.out.println("sum of digits"+b);
	}

}
