
public class sumofeven {
	static int sumofevennumbers(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i=i+2)
		{
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
	System.out.println(sumofevennumbers(8));//2+4+6+8//20

	}

}
