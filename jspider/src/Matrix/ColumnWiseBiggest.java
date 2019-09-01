package Matrix;

import String.Add__two_matrix_element;

public class ColumnWiseBiggest {

	public int[] Colwisebiggest(int mat[][])
	{
		int cb[]=new int[mat.length];
	
		for(int i=0;i<mat[0].length;i++)
		{
			cb[i]=mat[0][i];
		
			for(int j=0;j<mat.length;j++)
			{
				if(mat[j][i]>cb[i])
					cb[i]=mat[j][i];
			}
	}
		return cb;
	}
	public static void main(String[] args) {
		Add__two_matrix_element mt=new Add__two_matrix_element();
		int ar[][]= {{34,56,78},{56,78,90},{23,45,56}};
		mt.dispmat(ar);
		ColumnWiseBiggest big=new ColumnWiseBiggest();
		int rbig[]=big.Colwisebiggest(ar);
		for(int i=0;i<rbig.length;i++)
		{
			System.out.println(i+1 +"biggest element is:"+rbig[i]);
		}
	}

}
