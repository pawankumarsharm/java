package practiseprogrmme;

public interface abstractionn {
public void transfermoney();

public class axis implements abstractionn
{
	public void transfermoney()
	{
		System.out.println("sucess");
	}
}
public class sbi implements abstractionn
{
	private void tranfermoney() {
		System.out.println("successfully");
	}

	@Override
	public void transfermoney() {
		
	}
}
class user
{
	public static void main(String[] args) {
		//abstractionn a=new abstractionn();
	}
}

}


