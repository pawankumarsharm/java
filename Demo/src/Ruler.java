
/* class Node {
	 int i;
	 Node(int i){
		 this.i=i;
	 }
	 public static void main(String args[]) {
		 Node Obj=new Node(10);
		 Node Obj1=new Node();//compilation error
		 System.out.println(Obj.i);
		 System.out.println(Obj1.i);
	 }
 }*/

	/*Abstract class Node{
	 void printName() {
		System.out.println("Name");
	}
	abstract void printPan();
}
public class MyAbstract extends Node{
	
	public static void main(String[] args) {
		MyAbstract Ma=new MyAbstract();
		Ma.printName();
		Ma.printPan();
	}
	private void printPan() {
		System.out.println("pan");//compile time error:MyAbstrct  canneot override printpan()
	}

}*/

/*class fdyfdsyr{
	fdyfdsyr get() {return this;}
}
class Super{
	Super get() {return this;}
	void message() {System.out.println("class B");}
}
public class Main extends Super{//compilation error//
	Main get() {return this;}
	void message() {System.out.println("class Main");}
	public static void main(String args[]) {
		Super s=new Main();
		s.get().message();
	}
}*/

//import java.sql.SQLException;
/*public class ExceptionClass
{
	void m() throws NullPointerException{}
}
class gh extends ExceptionClass
{
void m() throws RuntimeException{}
}*/
/*class Animal
{
	void eat() {System.out.println("eating");}
}
class Repetile extends Animal{
	void eat() {System.out.println("repetile eating");}
}
class Snake extends Repetile{
	void eat() {System.out.println("Snake eating");}
	
	public static void main(String args[]) {
		Animal a,r,s;
		a=new Animal();
		r=new Repetile();
		s=new Snake();
		a.eat();
		r.eat();
		s.eat();//nothing will print
	}
}*/
/*public class Tool{
	private final int i,j;
	Tool(int i,int j){
		this.i=i;
		this.j=j;
		String code = makeCode();
	}
	protected String makeCode() {
		return "["+i+","+j+"]";
	}
	public final String toString() {
		return makeCode();
	}
}
		 class ColorTool extends Tool{
			private final String color;
			ColorTool(int i,int j,String color){
				super(i,j);
				this.color=color;
			}
			protected String makeCode() {
				return super.makeCode()+":"+color;
			}
			public static void main(String args[]) {
				System.out.print(new ColorTool(4,2,"Green"));///error//
					
				}
	}*/

/*public class Faculty extends Staff
{
	public static void main(String[] args) {
		new Faculty().newGn();
	}
	void newGn()
	{
		typeCast(new Staff(),new Faculty());
		typeCast((Faculty) new Staff(),new Faculty());
	}
	void typeCast(Staff s1,Faculty f1)
	{
		Faculty s2=(Faculty)s1;
		Staff f2=(Staff)f1;//exception staff cannot be cast to faculty
	}
}
class Staff{}*/

/*class Faculty{
	public static void greet() {
		System.out.println("hello world!");//hello world//
	}
	public static void main(String[] args) {
		((Faculty)null).greet();
	}
	}*/

/*class OuterClass
{
	class InnerClass{
		static void innerMethod() {  //compilation error
			System.out.println("inside innerMethod");
		}
	}
	public static void main(String[] args) {
		InnerClass.innerMethod();
	}
}*/

/*class Demo{
	int x=1;
}
class Main{
	public static void main(String[] args) {
		final int i1=4;
		i1=5;//compilation error
		final Demo i2=new Demo();
		i2.x=3;
	}
}*/

/*class Ball{
	int speed=150;
	public static void main(String[] args) {
		final Ball b1=new Ball();
		b1.speed=170;
		Ball b2=new Ball();
		b1=b2;//compilation error
		System.out.print(b1.speed);
	}
}*/

/*public class Confusing{
	private Confusing(Object o) {
		System.out.println("Object");
	}
	private Confusing(double[] array) {
		System.out.println("double array");//double array
	}
	public static void main(String[] args) {
		new Confusing(null);
	}
	}*/

/*class Base{
	public String className="Base";
}
class Derived extends Base{
	String className="Derived";//derived but if we put private before string then its gives error
}
public class TestDemo{
	public static void main(String[] args) {
		System.out.println(new Derived().className);
	}
	
}*/

/*public class calculation{
	void sum(int a,long b) {
		System.out.println("A method invoked");
	}
	void sum(long a,int b) {
		System.out.println("B method invoked");
	}
	public static void main(String[] args) {
		calculation obj=new calculation();
		obj.sum(5, 9);//ambiguity is arrise with method sum()//	}
	}
}*/

/*import java.util.*;
public class Animal{
	public static void main(String[] args) {
		String[] arr= {"monkey","horse","cat"};
		List<String> list=(List<string>) Arrays.asList(arr);//compilation error the correct method is toList not asList
		arr[2]="Dog";
		for(String word:list) {
			System.out.println(word);
		}
				
	}
}*/

/*public class Test{
	static void go(int z) {
		System.out.println("int");
	}
	static void go(Object z) {
		System.out.println("Object");
	}
	static void go(Double z) {
		System.out.println("Double");
	}
	static void go(Number z) {
		System.out.println("number");//number
	}
public static void main(String[] args) {
	Integer i=6;
	go(i);
}

	}*/

/*public class Ruler{
	public static void main(String[] args) {
		for(int i=0;i<100;i++)
			Animal animal=new Animal();//compilation error
		System.out.println(Animal.numCreated());
	}
}
class Animal{
	private static long numCreated=0;
	public Animal() {
		numCreated++;
	}
	public static long numCreated() {
		return numCreated;
	}
}*/







	


