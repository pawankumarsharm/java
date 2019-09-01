package Matrix;

import String.Add__two_matrix_element;

public class ReverseRowWiseElement {
	static int reverserowise(int mat[][])
	{
		int t=0;
		for(int i=0;i<mat.length;i++)
		{
		
			for(int j=0;j<mat[i].length/2;j++)
			{
				 t=mat[i][j];
				mat[i][j]=mat[i][mat[i].length-1-j];
				mat[i][mat[i].length-1-j]=t;
			}
		}
		return t;
	}
	public static void main(String[] args) {
		Add__two_matrix_element mt=new Add__two_matrix_element();
		int ar[][]= {{34,56,78},{56,78,90},{23,45,56}};
		mt.dispmat(ar);
		//ReverseRowWiseElement rev=new ReverseRowWiseElement();
		//int rrev[]=reverserowise(ar);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
				System.out.println(i+1 +"rowwise reverse element is:"+ar[j][i]);
				//System.out.print(ar[j][i]);	
			}
			System.out.println();
		
		}
	}

}
