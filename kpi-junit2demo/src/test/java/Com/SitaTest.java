package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class SitaTest {

@Test
	
	public void show() {
		Sita s = new Sita();
		
		assertEquals(0,s.empid(0));
		assertEquals("Surya",s.empname("Surya"));
		assertEquals(0,s.empage(0));
		assertEquals("White",s.empcolor("White"));
		assertEquals("123",s.empdob("123"));
		assertEquals(0,s.empsalary(0));
		assertEquals("Engineer",s.emprole("Engineer"));
		assertEquals("BMW",s.empcar("BMW"));
}
}
