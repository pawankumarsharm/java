package Recursion;

public class searcharray {
	static int searcharray(int a[],int i,int ele)
	{
		if(i>=a.length)
			return -1;
		if(a[i]==ele)
			return i;
		return searcharray(a,i+1,ele);
	}
	public static void main(String[] args) {
		int ar[]= {23,45,56,78,12,18};
		int in=searcharray(ar,0,56);
		if(in>0)
			System.out.println("array element is  at"+in+"there");
		else
			System.out.println("it is not present");
		}

}
