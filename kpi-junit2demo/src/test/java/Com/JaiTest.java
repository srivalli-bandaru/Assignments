package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JaiTest {

@Test
	
	public void show() {
		Jai j = new Jai();
		
		assertEquals(0,j.empid(0));
		assertEquals("Surya",j.empname("Surya"));
		assertEquals(0,j.empage(0));
		assertEquals("White",j.empcolor("White"));
		assertEquals("123",j.empdob("123"));
		assertEquals(0,j.empsalary(0));
		assertEquals("Engineer",j.emprole("Engineer"));
		assertEquals("BMW",j.empcar("BMW"));
}
}