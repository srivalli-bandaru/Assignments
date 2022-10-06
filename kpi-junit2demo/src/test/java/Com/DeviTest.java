package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class DeviTest {

@Test
	
	public void show() {
		Devi d = new Devi();
		
		assertEquals(0,d.empid(0));
		assertEquals("Surya",d.empname("Surya"));
		assertEquals(0,d.empage(0));
		assertEquals("White",d.empcolor("White"));
		assertEquals("123",d.empdob("123"));
		assertEquals(0,d.empsalary(0));
		assertEquals("Engineer",d.emprole("Engineer"));
		assertEquals("BMW",d.empcar("BMW"));
}
}
