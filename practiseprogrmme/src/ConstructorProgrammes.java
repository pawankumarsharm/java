import javax.swing.text.StyledEditorKit.ForegroundAction;
//java is good langauage
public class ConstructorProgrammes {
public static void main(String[] args) {
	String s="java is good language";
	String str="";
	int first=s.indexOf(" ");
	System.out.println(first);
	int second=s.indexOf(" ",first+1);
	System.out.println(second);
	int last=s.indexOf(" ",second+1);
	System.out.println(last);
	for(int i=last-1;i>second;i--) {
		str+=s.charAt(i);
	}
	//System.out.println(s.substring(0,second)+" "+str+s.substring(last,s.length()));
	System.out.println(str);
	/*int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	int largest = arr[0];
	int secondLargest = arr[0];
	
	System.out.println("The given array is:" );
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	for (int i = 0; i < arr.length; i++) {

		if (arr[i] > largest) {
			secondLargest = largest;
			largest = arr[i];

		} else if (arr[i] > secondLargest) {
			secondLargest = arr[i];

		}
	}

	System.out.println("\nSecond largest number is:" + secondLargest);*/

	
	
	
	
	
	
	
	
	
/*int A[]= {1,2,3,4,5};
int B[]= {2,4,8,9,40,9};
int C[]=new int[A.length+B.length];
for(int i=0;i<A.length;i++) {
	C[i]=A[i];
}
for(int i=A.length;i<C.length;i++) {
	C[i]=B[i-A.length];
}
for(int i=0;i<C.length;i++) {
	System.out.print(C[i]+"  ");
}*/

}}

