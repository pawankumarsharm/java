import java.util.*;
public class ABCD {
public static void main(String args[]) {
	int n,rim,even=0,odd=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	n=s.nextInt();
	for(;n!=0;n=n/10) {
	rim=n%10;
	if(rim%2==0) {
		even=even+1;
	}else {
		odd=odd+1;
	}}
System.out.println("Even number is = "+even);	
System.out.println("Odd number is = "+odd);
}
}
