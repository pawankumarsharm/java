package dsProg;

public class MyQueue {
Object q[];
int capacity;
int front;
int rear;

public MyQueue(int capacity)
{
	this.capacity=capacity;
	this.rear=this.front=-1;
	q=new Object[this.capacity];
}
public void enqueue(Object obj)
{
	if(rear==capacity-1)
	{
		System.out.println("Queue is empty..");
		return;
	}
	if(front==-1)
	{
		front=0;
	}
	q[++rear]=obj;
}
public String toString()
{
	String st="[";
	for(int i=front;i<=rear;i++)
		{
		st=st+q[i];
		if(i<rear)
			st=st+",";
				}
	return st+"]";
		}
public Object dequue()
{
	if(front==-1)
	{
		System.out.println("queue is empty...");
		return null;
	}
Object obj=q[front++];
if(front>rear)
	front=rear=-1;
	return obj;
}
public int size()
{
	return rear-front+1;
}
public static void main(String[] args) {
	MyQueue mq=new MyQueue(5);
	mq.enqueue("A");
	mq.enqueue("B");
	mq.enqueue("C");
	System.out.println(mq);
	System.out.println(mq.size());
	System.out.println(mq.dequue());
	System.out.println(mq.dequue());
	System.out.println(mq.dequue());
	System.out.println(mq.dequue());
}
}


