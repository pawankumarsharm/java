import java.util.Scanner;

public class biggestswitch {

	public static void main(String[] args) {
		int a,b,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a>b);
		if(a>b) {
			k=1;
		}else {
			k=0;
		}
		switch(k)
		{
		case 1:
			System.out.println("a is greatest"+a);
			break;
		case 0:
			System.out.println("b is greatest"+b);
			break;
		
		}

	}

}
