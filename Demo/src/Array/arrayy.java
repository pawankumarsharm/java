package Array;

public class arrayy {

	public static void main(String[] args) {
//int a[]= {9,5,3,1,4,7};
//int b[]= {2,6,8,3,1};
//int i,j,t = 0;
//for(i=0;i<a.length-1;i++){
//	for(j=0;j<b.length-1;j++) {
//		if(a[i]==a[j]) 
//			t++;
//		}
//		if(t==0) 
//			System.out.println(a[i]);
//		
//	
		int a[] = {12,16,15,89,78}; 
		int a1[] = {12,16,15,89,45,77,99}; 
		int k=a.length-1; 
		int l=a1.length-1; 
		for(int i=0;i<=k;i++){ 
		int count=0; 
		for(int j=0;j<=l;j++){ 
		if (a[i]==a[j]) 
		count++; 
		} 
		if(count==0) 
		System.out.println(a[i]); 
		
}
}
}