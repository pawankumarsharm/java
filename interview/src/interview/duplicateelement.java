package interview;

public class duplicateelement {

	public static void main(String[] args) {
		int ar[]= {1,2,9,5,6,8,3,5,1,2,9};
		int count=0;
		int ar1[]=new int[10];
		for( int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
				
					System.out.print(ar[i]+" ");
					
				}
				
			}
		}
	}

}
