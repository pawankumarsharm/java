import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int a=in.nextInt();
		
int even=0,odd=0,sum1=0,sum2=0;
while(a!=0) {
	int r=a%10;
	if(a%2==0)
		sum1=sum1+r;
		//even++;
		else
			sum2=sum2+r;
			//odd++;
	a=a/10;
	}
System.out.println(sum1);
System.out.println(sum2);
}

	}


