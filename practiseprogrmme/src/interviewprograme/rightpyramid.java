package interviewprograme;

public class rightpyramid {

	public static void main(String[] args) {
	 int n=12,st=1;
	 for (int i = 1; i <=n; i++) {
		 for(int j=1;j<=st;j++) {
			 System.out.print(j);
		 }
		 if(i<=n/2)
		 {
			 st++;
		 }
		 else
		 {
			 st--;
		 }
		 System.out.println();
		
	}

	}

}
