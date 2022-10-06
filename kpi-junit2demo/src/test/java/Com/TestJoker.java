package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Ques5.Joker;

public class TestJoker {

	@Test
	
	public void check() {
		Joker j = new Joker();
		String hands = j.dance();
		String pot = j.dance1();
		String fire = j.dance2();
		
		assertEquals("Bharatanatyam",hands);
		assertEquals("Kathakali",pot);
		assertEquals("Kuchipudi",fire);
	}
}
