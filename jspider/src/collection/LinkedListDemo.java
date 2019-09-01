package collection;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("modi");
		l1.add("Rahul");
		l1.add("Mayawati");
		l1.add("nikhil");
		l1.add("kejriwal");
		l1.add(30);
		l1.add(null);
		l1.removeLast();
		l1.addFirst("cccc");
		l1.set(0, "software");
		l1.add(2,"rajnikanth");
		System.out.println(l1);
	}

}
