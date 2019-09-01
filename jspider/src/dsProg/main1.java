package dsProg;

public class main1 {

	public static void main(String[] args) {
		DoublyLinkedList sl=new DoublyLinkedList();
		sl.add("apple");
		sl.add("orange");
		sl.add("mango");
		sl.add("banana");
		System.out.println(sl);
		sl.addfirst("grapes");
		System.out.println(sl);
System.out.println("delete 1"+sl.deletefirst());
	System.out.println(sl);
	System.out.println("delete 2"+sl.deletelast());
	System.out.println(sl);
		sl.add("kivi");
		System.out.println(sl);
	//System.out.println("delete 3"+sl.delete(3));
//	System.out.println(sl);
	}

}
