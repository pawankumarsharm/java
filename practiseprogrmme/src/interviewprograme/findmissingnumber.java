package interviewprograme;

public class findmissingnumber {

	public static void main(String[] args) {
		int a[]= {1,2,0,4,5,6,7};
		int sum=0,missing,miss=0;
		for (int i = 0; i <= a.length; i++) {
			sum=sum+i;
		}
		for (int j = 0; j < a.length; j++) {
			miss=miss+a[j];
		}
		missing=sum-miss;
		System.out.println(missing);
		
		}

}
