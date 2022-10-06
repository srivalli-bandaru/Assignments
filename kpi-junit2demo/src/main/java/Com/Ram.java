package Com;

public class Ram extends Employee{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("employee details");
	}

	@Override
	String empname(String name) {
		// TODO Auto-generated method stub
		System.out.println("Ram");
		return null;
	}

	@Override
	int empid(int a) {
		// TODO Auto-generated method stub
		System.out.println("12");
		return 0;
	}

	@Override
	int empage(int a) {
		// TODO Auto-generated method stub
		System.out.println("24");
		return 0;
	}

	@Override
	String empcolor(String color) {
		// TODO Auto-generated method stub
		System.out.println("White");
		return null;
	}

	@Override
	String empdob(String dob) {
		// TODO Auto-generated method stub
		System.out.println("24/09/2000");
		return null;
	}

	@Override
	int empsalary(int salary) {
		// TODO Auto-generated method stub
		System.out.println("20000");
		return 0;
	}

	@Override
	String emprole(String role) {
		// TODO Auto-generated method stub
		System.out.println("Cashier");
		return null;
	}

	@Override
	String empcar(String car) {
		// TODO Auto-generated method stub
		System.out.println("Baleno");
		return null;
	}

}
