package interviewprograme;

public class sortanmarray {

	public static void main(String[] args) {
		int ar[]= {45,12,85,32,89,39,69};
		int temp;
		for (int i = 1; i < ar.length; i++) {
			for (int j = i; j >0; j--) {
				if(ar[j]<=ar[j-1])
				{
					temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
