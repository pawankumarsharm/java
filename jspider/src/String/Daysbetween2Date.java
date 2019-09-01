package String;

public class Daysbetween2Date {

	
	int dd,mm,yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	void Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0||yy%4==0&&yy%10!=0)
			month[2]=29;
	}
	int noofDays()
	{
		int days=dd;
		int y=yy-1;
		days=days+y+365+(y/400+y/4-y/100);
		for(int i=1;i<mm;i++)
		
			days=days+month[i];
			return days;
		
	}
	
	public static void main(String[] args) {
		Daysbetween2Date d1=new Daysbetween2Date();
		Daysbetween2Date d2=new Daysbetween2Date();
		d1.Date(12, 5, 88);
		d2.Date(18, 9, 98);
		int nd1=d1.noofDays();
		int nd2=d2.noofDays();
		System.out.println("no of days between the dates:"+(nd1+nd2));
	}

}
