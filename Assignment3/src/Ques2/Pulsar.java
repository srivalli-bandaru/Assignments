package Ques2;

public class Pulsar extends Bike{

	@Override
	public void bikeColor() {
		// TODO Auto-generated method stub
		System.out.println("Black");
	}

}
class Main {
	public static void main(String[] args) {
		Pulsar myPulsar = new Pulsar();
		myPulsar.bikeColor();
		myPulsar.speed();
	}
}