package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("modi");
		l1.add("Rahul");
		l1.add("Mayawati");
		l1.add("nikhil");
		System.out.println(l1);//[modi,Rahul,Mayawati,nikhil]
		
		ListIterator itr=l1.listIterator();
		while(itr.hasNext()) {
			String s=(String)itr.next();
			if(s.equals("mayawati")){
				itr.remove();
			}
					
			else if(s.equals("nikhil")){
				itr.add("chaitu");
			}
			else if(s.equals("Rahul")) {
				itr.set("charan");
			}
		}
		System.out.println(l1);//[modi,charan,mayawati,nikhil,chaitu]

	}

}
