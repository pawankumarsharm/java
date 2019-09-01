package Matrix;

import String.Add__two_matrix_element;

public class rowcolwisesum {
	public int rowsum(int mat[][])
	{
		int sum=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				sum=sum+mat[i][j];
			}
	}
		return sum;
	}
	public int colsum(int mat[][])
	{
		int sum=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				sum=sum+mat[i][j];
			}
	}
		return sum;
	}
	public static void main(String[] args) {
		Add__two_matrix_element mt=new Add__two_matrix_element();
		int ar[][]= {{34,56,78},{56,78,90},{23,45,56}};
		mt.dispmat(ar);
		rowcolwisesum eoo=new rowcolwisesum();
		int cs=eoo.colsum(ar);
		int rs=eoo.colsum(ar);
		System.out.println("sum of row element."+rs);
		System.out.println("sum of col element."+cs);
		

	}

}
