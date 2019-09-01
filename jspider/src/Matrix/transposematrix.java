package Matrix;

import String.Add__two_matrix_element;

public class transposematrix {
	static int[][] transpose(int mat[][])
	{
		int tr[][]=new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++)
		{
		
			for(int j=0;j<mat[i].length;j++)
			{
				tr[i][j]=mat[i][j];
			}
		}
		return tr;
	}
	public static void main(String[] args) {
		Add__two_matrix_element mt=new Add__two_matrix_element();
		int ar[][]= {{34,56,78},{56,78,90},{23,45,56}};
		mt.dispmat(ar);
		//transposematrix big=new transposematrix();
		int[][] rbig=transpose(ar);
		System.out.println("--------------------------");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++) {
				System.out.print(ar[j][i]+" ");	
			}
			System.out.println();
		}
	}
	}

