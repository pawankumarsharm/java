package Recursion;

public class somofarrayelement {
	static int sumofarray(int a[],int i,int sum)
	{
		if(i==a.length)
			return sum;
		sum=sum+a[i];
		return sumofarray(a,i+1,sum);
	}
	public static void main(String[] args) {
		System.out.println("mms");
		int ar[]= {23,45,76,98,12,76};
		int sum=sumofarray(ar,0,0);
		System.out.println(sum);
		System.out.println("mmf");
	}

}
