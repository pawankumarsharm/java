import java.util.*;
public class primeornot {
public static void main(String args[]) {
	int i,n,c=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	n=s.nextInt();
	for(i=2;i<=n/2;i++) {
		if(n%i==0) {
			c=1;
			break;
		}
	}
	if(c==0) {
		System.out.println("prime number is ="+n);
	}else {
		System.out.println("It's not prime number");
	}
}
}

