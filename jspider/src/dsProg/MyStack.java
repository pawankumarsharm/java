package dsProg;

public class MyStack {

		int capacity;
		Object stk[];
		int top;
		public  MyStack(int capacity)
		{
			this.capacity=capacity;
			this.stk=new Object[capacity];
			top=-1;
		}
			public void push(Object obj)
			{
				if(top==capacity-1)
				{
					System.out.println("stack overflow.....");
					return;
				}
				stk[++top]=obj;
			}
			Object pop()
			{
				if(top==-1)
				{
					System.out.println("stack underflow.....");
					return null;
		}
				return stk[top--];
			}
			public String toString()
			{
				String st="[";
				for(int i=0;i<=top;i++)
				{
					st=st+stk[i];
					if(i<top)
						st=st+",";
				}
				return st+"]";
			}
			public int size()
			{
				return top+1;
			}
			public Object peek()
			{
				if(top==-1)
				{
					System.out.println("stack underflow...");
					return null;
				}
				return stk[top];
			}
		
	}


