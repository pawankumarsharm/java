package String;

import java.util.Scanner;

public class Sum_of_Matrix {

	public static void main(String[] args) {
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
		System.out.println("user entered matrix:");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				sum=sum+mat[i][j];
			}
		}
		System.out.println("sum of matrix elements"+sum);
	}
	
}
