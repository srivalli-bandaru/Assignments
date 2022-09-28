package Ques3;

public class Parent implements Dog{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("dog will bark");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog will eat");
	}

		
	
}
	
class TestSuper2 {
	public static void main(String args[]) {
		Parent p = new Parent();
		p.bark();
		p.eat();
		
	}
}

