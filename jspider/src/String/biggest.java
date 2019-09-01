package String;

public class biggest {

	int getBiggest(int[][] mat)
	{
		int big=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>big)
				{
					big=mat[i][j];
				}
			}
		}
			return big;
	}
	
	public static void main(String[] args) {
		Add__two_matrix_element mt=new Add__two_matrix_element();
		System.out.println("read  matrix:");
		int a[][]=mt.readmat();
		System.out.println("entered matrix:");
		mt.dispmat(a);
		 biggest b=new  biggest();
		int big=b.getBiggest(a);
		System.out.println("biggest value is"+big);
	}

}
