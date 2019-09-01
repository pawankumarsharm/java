package practiseprogrmme;

public class inheritance {
	
	void eat()
	{
		System.out.println("hiii...eating");
	}
}
	
class dog extends inheritance{
	void bark(){
	System.out.println("hello...barking");
	}
}
class testinheritance
{
	public static void main(String[] args) {
		dog d=new dog();
		d.bark();
		d.eat();
	}
}
