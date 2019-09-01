package interviewprograme;

public class spacetrainglenumber {

	public static void main(String[] args) {
		int n=6;
		for (int i = 1; i <n; i++) {
			for (int j = 0; j<n; j++) {
				if(i+j>n-1)
				System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
