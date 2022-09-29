package Ques1;

public class Gadgets {
	void Mobile(String name) {
		System.out.println(name);
	}
	void Mobile(int price) {
		System.out.println("price is "+price);
	}
	void Mobile(float model) {
		System.out.println("model is"+model);
	}
}
class Mobile1{
	public static void main(String s[]) {
		Gadgets g = new Gadgets();
		g.Mobile("Oneplus");
		g.Mobile("50000");
		g.Mobile("Nord");
	}
}
