package interview;

public class search_element {

	public static void main(String[] args) {
		int a[]= {1,2,6,8,4};
		int b[]= {2,4,3,1,0,7,9};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					count++;
			}
			if(count==0)
				
					System.out.print(a[i]+" ");
			}
		}
	}


