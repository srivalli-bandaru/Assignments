package Ques2;

public class Dog extends Animal {
	void bark()
	{
		System.out.println("barking");
	}

}
class TestInheritance{
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}