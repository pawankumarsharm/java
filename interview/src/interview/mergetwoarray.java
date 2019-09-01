package interview;

public class mergetwoarray {

	public static void main(String[] args) {
		int count=0;
		int a[]= {1,3,5,7};
		int b[]= {2,4,6,8};
		
		int c[]=new int[b.length+a.length];
		
		for(int i=0;i<b.length;i++)
		{
			c[i]=b[i];
			count++;
			}
		for(int j=0;j<a.length;j++)
		{
			c[count++]=a[j];
		}
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
			}

}
