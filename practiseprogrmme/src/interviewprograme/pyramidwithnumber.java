package interviewprograme;

public class pyramidwithnumber {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+"");
				if(k<i)
					System.out.print("*");
			}
			System.out.println();
		}
			}
}
