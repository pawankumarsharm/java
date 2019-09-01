import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one Interger number");
		int n=sc.nextInt();
	//1st way	
//		if(n%2==1) {
//			System.out.println(n+" is odd");
//		}else {
//			System.out.println(n+" is even");
//		}
		//2nd way
//		if(n/2*2==n)
//			System.out.println(n+" even");
//		else
//			System.out.println(n+" odd");
		//3rd way
//		String s[]= {"even","odd"};
//		System.out.println(n+" is "+s[n%2]+" number");
		//4th way
//		if((n&1)==0) {
//			System.out.println(n+" is even");
//		}else {
//			System.out.println(n+" is odd");
//		}
		//5th way
//		switch(n%2)
//		{
//		case 0: System.out.println("even");
//		break;
//		case 1: System.out.println("odd");
//		break;
//		}
		String rs=((n%2)==0)?"even":"odd";
		System.out.println(n+" is "+rs+" Number");
	}
}
