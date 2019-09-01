package Array;

import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array");
		int a[]= {1,2,3,4,5,6,1,3};
		int temp = 0,i,j;
		for (i = 0; i < a.length; i++) {
			for (j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]+" ");
				}
				
			}
//			if(i!=j) {
//				System.out.print(a[i]);
//			}
		}	
		
	}

}






//The array with its size is passed as an argument. current stores the element to compare others with. count is the number that we need finally. count is assigned the value of size of the array (i.e we assume that all elements are unique). (It can also be the other way round) A for loop starts, and the first (0th) element is compared with the elements after it. If the element reoccurs, i.e. if (current==arr[j]), then the value of count is decremented by 1 (since we expected all elements to be unique, and because it is not unique, the number of unique values is now one less than what it was initially. Hence --count). The loops go on, and the value is decremented to whatever the number of unique elements is. In case our array is {1,1,1,1}, then the code will print 0 instead of a negative value.