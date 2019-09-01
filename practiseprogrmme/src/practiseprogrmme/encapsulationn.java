package practiseprogrmme;

public class encapsulationn {
	private int salary;
	public int getsalary()
	{
		return salary;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public static void main(String[] args) {
		encapsulationn e=new encapsulationn();
		e.setsalary(112);
		System.out.println("the salary is" +e.getsalary());

	}

}
