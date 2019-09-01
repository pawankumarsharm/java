package String;

import java.util.Scanner;

public class Add__two_matrix_element {
	
 public int[][] readmat()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of rows and no. of column");
	int row=sc.nextInt();
	int col=sc.nextInt();
	
	int mat[][]=new int [row][col];
	System.out.println("enter"+row*col+"elements");
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			mat[i][j]=sc.nextInt();
			}
}
	return mat;
}

public void dispmat(int[][] x)
{
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			System.out.print(x[i][j]+" ");
		}
		System.out.println();
}
}
int[][] addmat(int a[][],int b[][])
{
	if(a.length!=b[0].length||a[0].length!=b.length)
	{
		System.out.println("not possible to add");
	
		return null;
	}

int sum[][]=new int[a.length][b[0].length];
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<b[i].length;j++)
	{
		for(int k=0;k<b.length;k++) {
			
		sum[i][j]=a[i][j]+b[i][j];
		}
		}
}
return sum;


}

	public static void main(String[] args) {
		Add__two_matrix_element mt=new Add__two_matrix_element();
		System.out.println("read 1st matrix:");
		int a[][]=mt.readmat();
		System.out.println("read 2nd matrix:");
		int b[][]=mt.readmat();
		System.out.println("user entered 1st matrix:");
		mt.dispmat(a);
		System.out.println("user entered 2nd matrix:");
		mt.dispmat(b);
		System.out.println("sum of matrix is");
		int c[][]=mt.addmat(a, b);
		//mt.dispmat(c);
		
		
		
		if(c==null)
		{
			System.out.println("addition failed");
			
		}
			else
			{
				System.out.println("added matrix is:");
				mt.dispmat(c);
			}
		}
			
	}

	
