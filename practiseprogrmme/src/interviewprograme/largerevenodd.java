package interviewprograme;

public class largerevenodd {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
	
		for (int i = 0; i < a.length; i++) {
		
			if(a[i]%2==0)
				b[i]=a[i];
			else if(a[i]%2==1)
				c[i]=a[i];
		}
	
		
		for (int i = 0; i < c.length; i++) {
			//if(c[i]!=0)
			System.out.print(c[i]+" ");
		}
		System.out.println();
		int t=1;
		for (int i = 0; i < b.length-1; i++) {
			//if(b[i]!=0)
			for (int j = i+1; j < b.length; j++) {
				if(b[i]>b[j])
					System.out.print(b[i+1]+" ");
				t=0;
						break;	
			}
				if(t==0) {
					break;
				}
		}
	}
	}


