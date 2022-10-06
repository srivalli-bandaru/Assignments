package Ques7;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
public class Setque1 {
	public int check() {
		return 0;
		
	}	
	public static void main(String[] args) {
		Set<Integer> s2 = new HashSet<Integer>();
		
		s2.add(1);
		s2.add(1);
		s2.add(2);
		s2.add(2);
		s2.add(3);
		s2.add(3);
		s2.add(4);
		s2.add(4);
		s2.add(5);
		s2.add(5);
		s2.add(6);
		s2.add(6);
		s2.add(7);
		s2.add(7);
		s2.add(8);
		s2.add(8);
		s2.add(9);
		s2.add(9);
		s2.add(10);
		s2.add(10);
		System.out.println(s2);
		int lastElement = 0;
		for(int x : s2)
		{
			lastElement = x;
		}
		System.out.println("last element is"+ lastElement);
	}
}

