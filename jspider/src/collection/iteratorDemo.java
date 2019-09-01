package collection;
import java.util.*;
public class iteratorDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for(int i=0;i<10;i++)
		{
			l.add(i);
		}
		System.out.println(l);//[0,1,2,3...10]
		
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			Integer n=(Integer)itr.next();
			if(n%2==0)
				System.out.println(n);//0,2,4,6,8
			else
				itr.remove();
		}
		System.out.println(l);//[0,1,2,3....10]
	}

}
