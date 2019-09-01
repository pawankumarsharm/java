package interviewprograme;

import java.util.HashSet;

public class removeduplicateelement {

	public static void main(String[] args) {
		int a[]= {1,2,2,3,4,4,4,5,5};
		/*HashSet<Integer> hash_set=new HashSet<Integer>();
		for (int i = 0; i < ar.length; i++) {
			hash_set.add(ar[i]);
		}
			System.out.println(hash_set);
*/			

		int[] temp = new int[a.length];;
		int j=0;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
			}
		}
       temp[j]=a[a.length-1];
			
	for (int i = 0; i < temp.length; i++) {
		if(temp[i]!=0)
		System.out.print(temp[i]+" ");
	}	

		}
}
//}