package Ques1;

public class Son extends Mother {

	@Override
	void work() {
		System.out.println("he is working");
	}
	public static void main(String args[]) {
		Son obj = new Son();
		obj.work();
	}
}
