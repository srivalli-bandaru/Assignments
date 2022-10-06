package Com;

public class Valli extends Employee implements Runnable{

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
		return 0;
	}

	@Override
	int empage(int a) {
		// TODO Auto-generated method stub
		return 0;
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
		return 0;
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
		System.out.println("Thread t10 is running");
	}
	public static void main(String[] args) {
		Thread t10 = new Thread("employee car");
		t10.start();
}
}