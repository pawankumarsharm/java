import java.util.*;
public class productofdigits {
	static int productofdigits(int x)
	{
		int pro=1;
		while(x!=0)
		{
			int r=x%10;
			pro=pro*r;
			x=x/10;
		}
		return pro;	
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int p=productofdigits(n);//345
		System.out.println("product of digits"+p);
	}

}
