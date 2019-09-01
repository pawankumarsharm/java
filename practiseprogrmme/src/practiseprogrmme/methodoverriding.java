package practiseprogrmme;

public class methodoverriding {
	void show()
	{
		System.out.println("parent show");
	}
}
class child extends methodoverriding
{
	void show()
	{
		System.out.println("child show");

	}
	

}
