import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one Inter number");
		int x=sc.nextInt();
		int b1=x/10;
		int b2=x%10;
		
		int sum=b1+b2+b1*b2;
		if(sum==x) 
			System.out.println(x+" is a special number");
			else 
				System.out.println(x+" is not a special number");
		
	}
}
