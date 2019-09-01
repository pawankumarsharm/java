package jspider;
import java.util.*;
public class Demo_StringArray {
public static void main(String args[]) {
	/*char ch;
	for(ch='a';ch<='z';ch++) {
		System.out.println(ch);
	}*/
	int i=1;
	for( i=1; true;i++ ) {
		//int i=1;
		if(i<=10) {
			//break;
		}else
		{
			System.out.println(i);
			//i++;
		}
	}
}
}
	/*String str="abcd";
	int a=1,b=2,c=3,d=4,sum=0,v=0;
	char ch[]= {'a','b','c','d'};
	int ar[]= {1,2,3,4};
	for(int j=0;j<ch.length;j++) {
	for(int i=0;i<str.length();i++) {
		//if(ch[j]==str.charAt(i)) {
			//ch.indexOf(haystack, needle);
			//int k=Arrays.asList(ch).indexOf('d');
			int k=findIndex(ch, 'd');
			System.out.println("  "+k);
		//}
	}
	}
	System.out.println(a);
}

private static int findIndex(char[] ch, char c) {
	// TODO Auto-generated method stub
	return 0;
}
}*/
/*import java.util.stream.IntStream; 
public class Demo_StringArray { 
  
    // Function to find the index of an element 
    public static int findIndex(int arr[], int t) 
    { 
        int len = arr.length; 
        return IntStream.range(0, len) 
            .filter(i -> t == arr[i]) 
            .findFirst() // first occurence 
            .orElse(-1); // No element found 
    } 
    public static void main(String[] args) 
    { 
        int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }; 
        char[] ch= {'a','b','c','d'};
        System.out.println("Index position of 5 is: "
                           + ch.length); 
        System.out.println("Index position of 7 is: "
                           + findIndex(my_array, 7)); 
    } 
} */
