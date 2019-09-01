package dsProg;

public class SinglyLinkedList {

	class Node
	{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data=data;
			
		}
	}
	
	Node head;
	int size;
public SinglyLinkedList()
	{
		head=null;
		size=0;
	}
	public void add(Object obj)
	{
		size++;
		Node n=new Node(obj);
		
		if(head==null)
		{
			head=n;
			//return;
		}
		Node t=head;
		while(t.next!=null) {
			t=t.next;
		}
		
		//return true;
	}	
		public boolean addfirst(Object obj)
		{
			Node n=new Node(obj);
			n.next=head;
				head=n;
				return true;
		}
		public String toString()
		{
			Node t=head;
			String st="[";
			
			while(t!=null)
			{
				st=st+t.data;
				if(t.next!=null)
					st=st+"-->";
				t=t.next;
			}
			st= st+"]";
			return st;
		}
		public Object deletefirst()
		{
			if(head==null)
			{
				System.out.println("list is empty...");
				return null;
			}
			Object obj=head.data;
			head=head.next;
			return obj;
		}
		public Object deletelast()
		{
			if(head==null)
			{
				System.out.println("list is empty...");
				return null;
			}
			Node t=head;
			Node t1=null;
			while(t.next!=null)
			{
				t1=t;
				t=t.next;
			}
			if(t1!=null)
				t1.next=null;
			else
				head=null;
			return t.data;
	}
		public Object delete(int in)
		{
			if(in<0||in>=size)
			{
				System.out.println("index not in the range");
				return null;
			}
			Node t=head;
			int i=0;
		while(i<in-1)
		{
			t=t.next;
			i++;
		}
		if(t.next!=null)
		{
			Object obj=t.next.data;
			t.next=t.next.next;
			return obj;
		}
		else
		{
			Object obj=t.data;
			head=null;
			return null;
		}
}
		}

