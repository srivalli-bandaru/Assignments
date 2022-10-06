package Ques5;

public class Joker {

	private String Dance;
	private String Name;
	public Joker() {
		
		 
	 }
	
	public Joker(String Dance,String Name) {
		this.Dance=Dance;
		this.Name=Name;
	
	}
	public static void main(String [] args) {
		Joker b = new Joker();
		Joker b1 = new Joker("Bharatanatyam","Joker1");
		Joker c = new Joker();
		Joker c1 = new Joker("Kuchipudi","Joker2");
		Joker d = new Joker();
		Joker d1 = new Joker("Kathakali","Joker3");
		Joker e = new Joker();
		Joker e1 = new Joker("Oddisi","Joker4");
		Joker f = new Joker();
		Joker f1 = new Joker("Garbha","Joker5");
		Joker g = new Joker();
		Joker g1 = new Joker("Folk","Joker6");
		Joker h = new Joker();
		Joker h1 = new Joker("Salsa","Joker7");
		Joker i = new Joker();
		Joker i1 = new Joker("Kathak","Joker8");
		
		System.out.println(b.Dance+" "+"Dancing"+" "+b.Name);
		System.out.println(b1.Dance+" "+"Dancing"+" "+b1.Name);
		System.out.println(c.Dance+" "+"Dancing"+" "+c.Name);
		System.out.println(c1.Dance+" "+"Dancing"+" "+c1.Name);
		System.out.println(d.Dance+" "+"Dancing"+" "+d.Name);
		System.out.println(d1.Dance+" "+"Dancing"+" "+d1.Name);
		System.out.println(e.Dance+" "+"Dancing"+" "+e.Name);
		System.out.println(e1.Dance+" "+"Dancing"+" "+e1.Name);
		System.out.println(f.Dance+" "+"Dancing"+" "+f.Name);
		System.out.println(f1.Dance+" "+"Dancing"+" "+f1.Name);
		System.out.println(g.Dance+" "+"Dancing"+" "+g.Name);
		System.out.println(g1.Dance+" "+"Dancing"+" "+g1.Name);
		System.out.println(h.Dance+" "+"Dancing"+" "+h.Name);
		System.out.println(h1.Dance+" "+"Dancing"+" "+h1.Name);
		System.out.println(i.Dance+" "+"Dancing"+" "+i.Name);
		System.out.println(i1.Dance+" "+"Dancing"+" "+i1.Name);
	}

	


public String dance() {
	return "Bharatanatyam";
}
	public String dance1() {
		return "Kathakali";
	}
	public String dance2() {
		return "Kuchipudi";
	}
}
