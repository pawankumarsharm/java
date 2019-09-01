package Matrix;

import String.Add__two_matrix_element;

public class CountEOMatrix {
	public int[] CountOE(int mat[][])
	{
		int eo[]= {0,0};
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				eo[mat[i][j]%2]++;
			}
		}
		return eo;
	}

	public static void main(String[] args) {
		Add__two_matrix_element mt=new Add__two_matrix_element();
		int ar[][]= {{34,56,78},{56,78,90},{23,45,56}};
		mt.dispmat(ar);
		CountEOMatrix eoo=new CountEOMatrix();
		int Count[]=eoo.CountOE(ar);
		System.out.println("number of even nos."+Count[0]);
		System.out.println("number of odd nos."+Count[1]);
		
	}

}
