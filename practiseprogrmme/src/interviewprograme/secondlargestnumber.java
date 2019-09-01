package interviewprograme;

public class secondlargestnumber {

	public static void main(String[] args) {
		int ar[]= {1,111,98,46,7,8};
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.print("the second largest element is ");
			for (int j = 0; j < ar.length; j++) {
				
				System.out.print(ar[1]+" ");
				break;
			
		}
	}
	

}
