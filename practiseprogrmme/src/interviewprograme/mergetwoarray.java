package interviewprograme;

public class mergetwoarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8,9};
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		for (int i = a.length; i < c.length; i++) {
			c[i]=b[i-a.length];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
			
		}
		}
		
				}
	
	

