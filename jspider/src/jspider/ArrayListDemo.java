package jspider;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
	public static void main(String[] args) {
		Collection cscol=new ArrayList();
		cscol.add("suman");
		cscol.add("pawan");
		cscol.add("mukesh");
		cscol.add(10);
		
		Collection eccol=new ArrayList();
		cscol.add("ashwin");
		cscol.add("rohit");
		cscol.add("deepa");
		cscol.add("ram");
		cscol.add("dua");
		cscol.add(null);

		Collection goocol=new ArrayList();
		goocol.addAll(cscol);
		goocol.addAll(eccol);
		System.out.println(goocol);
		System.out.println("no. of student attending google interview " + goocol.size());
		System.out.println("suman is there? " + goocol.contains("suman"));
		System.out.println("mahesh is there? " + goocol.contains("mahesh"));
		System.out.println("does all the cs student present? " + goocol.containsAll(cscol));
		System.out.println(goocol);
		goocol.remove("dua");
		System.out.println(goocol);
		goocol.removeAll(cscol);
		System.out.println(goocol);
		goocol.clear();
		System.out.println(goocol);
	}
}
