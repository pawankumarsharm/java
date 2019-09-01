package practiseprogrmme;

public class methodoverloading {
	int udid,cvv,cardno,otp;
	String uname;
	static String pwd;
	
	void pay(int upid)
	{
		this.udid=upid;
		System.out.println(upid);
		System.out.println("payment by upi");
	}
	void pay(String uname, String pwd)
	{
		this.uname=uname;
		this.pwd=pwd;
		System.out.println(uname+" "+pwd);
		System.out.println("payment by netbanking");
	}
	void pay(int cardno, int cvv, int otp)
	{
		this.cardno=cardno;
		this.cvv=cvv;
		this.otp=otp;
		System.out.println(cardno+" "+cvv+" "+otp);
		System.out.println("payment by atm card");
	}
	public static void main(String[] args) {
		methodoverloading m=new methodoverloading();
		m.pay(98273);
		m.pay("abc", "a");
		m.pay(8373, 873, 051);
		
	}

}
