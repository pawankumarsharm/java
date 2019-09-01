package Matrix;

import String.Add__two_matrix_element;

public class RowWiseBiggest {
	public int[] rowwisebiggest(int mat[][])
	{
		int rb[]=new int[mat.length];
	
		for(int i=0;i<mat.length;i++)
		{
			rb[i]=mat[i][0];
		
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>rb[i])
					rb[i]=mat[i][j];
			}
	}
		return rb;
	}
	public static void main(String[] args) {
		Add__two_matrix_element mt=new Add__two_matrix_element();
		int ar[][]= {{34,56,78},{56,78,90},{23,45,56}};
		mt.dispmat(ar);
		RowWiseBiggest big=new RowWiseBiggest();
		int rbig[]=big.rowwisebiggest(ar);
		for(int i=0;i<rbig.length;i++)
		{
			System.out.println(i+1 +"biggest element is:"+rbig[i]);
		}
	}

}
