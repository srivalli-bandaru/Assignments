package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class BhuTest {

	@Test
	
	public void show() {
		Bhu b = new Bhu();
		
		assertEquals(0,b.empid(0));
		assertEquals("Surya",b.empname("Surya"));
		assertEquals(0,b.empage(0));
		assertEquals("White",b.empcolor("White"));
		assertEquals("123",b.empdob("123"));
		assertEquals(0,b.empsalary(0));
		assertEquals("Engineer",b.emprole("Engineer"));
		assertEquals("BMW",b.empcar("BMW"));
	}
}
