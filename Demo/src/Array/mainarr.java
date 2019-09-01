package Array;
import java.util.*;
public class mainarr {

	public static void main(String[] args) {
		
		
		int ar[]=new int[10];
		
		for(int i=1;i<10;i++)
		{
			ar[i]=9-i;
		}
		for(int i=1;i<10;i++)
		{
			ar[i]=ar[9-i];
		}
		for(int i=1;i<10;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
