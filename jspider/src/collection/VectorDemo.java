package collection;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
	Vector v=new Vector();
	System.out.println(v.capacity());//[10]
	for(int i=0;i<10;i++) {
		v.add(i);
	}
	System.out.println(v.capacity());//[10]
		v.add("A");
		System.out.println(v.capacity());//[20]
		System.out.println(v);//[0,1,2,3,4,5,6,7,8,A]
	
	}

}
