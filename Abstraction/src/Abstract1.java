class Dog {
	String breed;
	public void bark()
	{
		System.out.println("Bark");
		
	}
}

class Animal extends Dog {
	
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		
		a.bark();
		System.out.println(a.breed);
	}

}

