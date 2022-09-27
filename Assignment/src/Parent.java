
public class Parent implements Son, Daughter{
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.sleep();
		p1.eat();
		p1.play();
		p1.art();
		
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Daughter will play");
	}

	@Override
	public void art() {
		// TODO Auto-generated method stub
		System.out.println("Daughter will art");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Son will sleep");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Son will eat");
	}
}
