package Com;

public class Ammu extends Employee implements Runnable{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String empname(String name) {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	int empid(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	int empage(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	String empcolor(String color) {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	String empdob(String dob) {
		// TODO Auto-generated method stub
		return dob;
	}

	@Override
	int empsalary(int salary) {
		// TODO Auto-generated method stub
		return 15000;
	}

	@Override
	String emprole(String role) {
		// TODO Auto-generated method stub
		return role;
	}

	@Override
	String empcar(String car) {
		// TODO Auto-generated method stub
		return car;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread t1 is running");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread("employee name");
		t1.start();
	}

}
