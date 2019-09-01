import java.util.*;
public class patternn {

	public static void main(String[] args) {
	int a=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			
			}
			for(int k=4;k>=(i*2);k--)
			{
				
				System.out.print((a++)+"*");
			}
			System.out.println();
		}
}

}