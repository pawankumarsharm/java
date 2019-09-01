package Matrix;

import String.Add__two_matrix_element;

public class biggestelement {
int getbiggest(int[][] mat)
{
	int big=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
					if(mat[i][j]>big)
						big=mat[i][j];
		}
}
		return big;
}

	public static void main(String[] args) {
		
		Add__two_matrix_element mt=new Add__two_matrix_element();
		System.out.println("read matrix:");
		int a[][]=mt.readmat();
		System.out.println("user entered matrix:");
		mt.dispmat(a);
		biggestelement bt=new biggestelement();
		int big=bt.getbiggest(a);
		System.out.println("biggest value is:"+big);
	}

}
