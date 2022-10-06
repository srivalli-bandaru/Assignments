package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Ques7.Setque1;
public class TestSetque1 {

	@Test
	public void check()
	{
		Setque1 s = new Setque1();
		int ss = s.check();
		assertEquals(0,s.check());
	}
}
