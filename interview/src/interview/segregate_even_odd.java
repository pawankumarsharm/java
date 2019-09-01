package interview;

public class segregate_even_odd {

	public static void main(String[] args) {
		int arr[]= {12,39,45,9,890,3};
		int j=-1,temp;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr.length%2==0)
			{
				//j++;
//			temp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
				System.out.print(arr[i]);		
			}		
		}
		System.out.println("array after seggeraation");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

		}
	}


