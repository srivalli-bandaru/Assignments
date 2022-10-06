package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class RajTest {

@Test
	
	public void show() {
		Raj r = new Raj();
		
		assertEquals(0,r.empid(0));
		assertEquals("Surya",r.empname("Surya"));
		assertEquals(0,r.empage(0));
		assertEquals("White",r.empcolor("White"));
		assertEquals("123",r.empdob("123"));
		assertEquals(0,r.empsalary(0));
		assertEquals("Engineer",r.emprole("Engineer"));
		assertEquals("BMW",r.empcar("BMW"));
}
}