package dsProg;

import dsProg.SinglyLinkedList.Node;

//import dsProg.SinglyLinkedList.Node;

public class DoublyLinkedList {

	
		class Node
		{
			Object data;
			Node next;
			Node prev;
			Node(Object data)
			{
				this.data=data;
				
			}
		}
	
		Node head;
		int size;
		public DoublyLinkedList()
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
				return ;
			}
			Node t=head;
			while(t.next!=null)
				t=t.next;
			t.next=n;
			n.prev=t;
		}
		
		public void addfirst(Object obj)
		{
			size++;
			Node n=new Node(obj);
			if(head==null)
			{
			head=n;
			return;
			}
			head.prev=n;
			n.next=head;
				head=n;
		}
		
		public String toString()
		{
			Node t=head;
			String st="[";
			
			while(t!=null)
			{
				st=st+t.data;
				if(t.next!=null)
					st=st+"<-->";
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
			head.prev=null;
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
			while(t.next!=null)
			{
				t=t.next;
			}
			if(t.prev==null)
				head=null;
			t.prev.next=null;
			return t.data;
	}
		public Object delete(int in)
		{
			if(in<0||in>=size)
			{
				System.out.println("index not in the range");
				return null;
				
			}
				if(head==null) {
					System.out.println("List is empty....");
					return null;
				}
				Node t=null;
				while(t!=null)
				{
					if(in==0)
						break;
					in--;
					t=t.next;
				}
				if(t.prev!=null)
				{
					t.prev.next=t.next;
				}
				else
				{
					head=head.next;
					head.prev=null;
			}
				if(t.next!=null)
				{
					t.next.prev=t.prev;
				}
				size--;
				return t.data;
	}
		public void add(Object obj,int in)
		{
			size++;
			if(in<0||in>=size)
			{
				System.out.println("index not in the range");
				return ;
			}
			if(in==0)
			{
				addfirst(obj);
				return;
			}
			Node t=head;
			while(t!=null)
			{
				if(in==0)
					break;
				in--;
				t=t.next;
			}
			Node n=new Node(obj);
			if(t.next==null)
			{
				t.next=n;
				n.prev=t;
				return;
			}
			n.next=t;
			n.prev=t.prev;
			t.prev=n;
			n.prev.next=n;
		}
}


