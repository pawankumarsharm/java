import java.util.*;
public class ArmsDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m,n,i,c=0,tem,rim,arm=0,tem1=0;
		System.out.println("Enter the two no.");
		m=s.nextInt();
		n=s.nextInt();
		for(i=m;i<n;i++) {
			tem=i;
			tem1=i;
			
//			while(tem1>0) {
//				rim=tem1%10;
//				arm=arm+(rim*rim*rim);
//				tem1=tem1/10;
//				
//			}		
			for(;tem1!=0;tem1=tem1/10) {
				rim=tem1%10;
				arm=arm+(rim*rim*rim);
				
			}
			if(arm==tem) {
				System.out.print(arm+" ");
				c++;
			}
			arm=0;
		}
		System.out.println();
		if(c==0) {
			System.out.println("Not armstrong number");
		}else {
		System.out.println("count ="+c);
		}

	}
	

}
