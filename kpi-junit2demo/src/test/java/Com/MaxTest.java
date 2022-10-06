package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxTest {

@Test
	
	public void show() {
		Max m = new Max();
		
		assertEquals(0,m.empid(0));
		assertEquals("Surya",m.empname("Surya"));
		assertEquals(0,m.empage(0));
		assertEquals("White",m.empcolor("White"));
		assertEquals("123",m.empdob("123"));
		assertEquals(0,m.empsalary(0));
		assertEquals("Engineer",m.emprole("Engineer"));
		assertEquals("BMW",m.empcar("BMW"));
}
}
