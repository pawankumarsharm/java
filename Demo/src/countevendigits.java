import java.util.Scanner;

public class countevendigits {
 static void count(int n) {
	 while(n>0)
	 {
	 int countEven = 0;
	 int countOdd = 0;
	 
	int num = n%10;          
	 if(num/2==0){
	 
	     countEven++;
	     System.out.println(countEven);
	 }
	
	 else{
	 
	     countOdd++;
	     n=n/10;
	     System.out.println(n);
	 }
	 //return countEven;
	 }
 }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		count(n);//345
		//System.out.println("count even digits"+b);

	}
}
