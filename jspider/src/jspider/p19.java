package jspider;

public class p19 {

	public static void main(String[] args) {
		
		/*for(char i='A';i<='E';i++)
		{
	    for(char j='A';j<=i;j++)
		{
			System.out.print(j);
		}*/
	    
	     for(int i=1;i<=5;i++)
		{
	    for(int j=1;j<=i;j++)
		{
			System.out.print((char)(j+64)+" ");/*System.out.print((char)(i+64)+" ");we can use it for printing same element in same line*/
		}
	     
		System.out.println();			
	}
	     			/*	A
	     				A B
	     				A B C
	     				A B C D
	     				A B C D E*/
	}

}
