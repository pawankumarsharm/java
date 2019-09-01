import java.util.*;
public class MethodArmS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number");
		m=s.nextInt();
		n=s.nextInt();
		for(i=m;i<=n;i++) {
			ArmStr(i);
		}
//		int j=ArmStr(n);
//		System.out.println();
//		System.out.println(j);

	}
	public static int ArmStr(int n) {
		int rim,arm=0,tem,count=0;
		tem=n;
		for(;n!=0;n=n/10) {
			rim=n%10;
			arm=arm+(rim*rim*rim);
		}
		if(arm==tem) {
			System.out.print(arm+" ");
			count=count+1;;
		}
		return count;
	}

}
