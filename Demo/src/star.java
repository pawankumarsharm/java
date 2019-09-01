
public class star {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=4;i++)
		{
	    for(int j=4;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();	
		}
		
		for(int i=1;i<=4;i++)
		{
	    for(int j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		System.out.println();	
		}
		
		int k=1;
		for(int i=1;i<=4;i++)
		{
	    for(int j=1;j<=i;j++)
		{
	    	
			System.out.print(k);
			k++;
		}
	    
		System.out.println();	
		}
		
	    for(int i=1;i<=4;i++)
	    {
	    	for(int j=3;j>=i;j--)
	    	{
	    		System.out.print(" ");
	    	 }
		for(int m=1;m<=i;m++)
		{
		
			System.out.print("*");
		}
		
			System.out.println();
		}
	    
	
for(int i=1;i<=5;i++)
{
	for(int j=4;j>=i;j--)
	{
		System.out.print(" ");
	}
	for(int m=1;m<=(i*2);m++)
	{
	
	System.out.print("*");
	}
	System.out.println();
	}

for(int i=5;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int m=4;m>=i;m--)
	{
	
	System.out.print("*");
	}
	for(int l=3;l>=i;l--)
	{
		System.out.println("*");
	}
	System.out.println();
	}

for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
	System.out.print("*");
}
System.out.println();	
}

for(int i=0;i<5;i++)    //outer loop for number of rows
{
  for(int j=5;j>i+1;j--)     //nested loop for number of spaces
    {
       System.out.print(" ");     //printing spaces
    }
  for(int l=0;l<=i*2;l++)     //nested loop for printing stars
    {
       System.out.print("*");      //printing stars
    } 
 System.out.println();     
}

for(int i=5;i>=0;i--)     //outer loop for number of rows
{
   for(int j=5;j>=i;j--)     //nested loop for spaces before the pyramid
      {
         System.out.print(" ");;     //printing white space
      }
   for(int l=1;l<=i*2+1;l++)     //loop for printing stars
      {
         System.out.print("*"+a);
              a+=1;                      //printing stars
      }
   System.out.println();;     //printing new line after each row
}
}

	}
