package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ValliTest {

@Test
	
	public void show() {
		Valli v = new Valli();
		
		assertEquals(0,v.empid(0));
		assertEquals("Surya",v.empname("Surya"));
		assertEquals(0,v.empage(0));
		assertEquals("White",v.empcolor("White"));
		assertEquals("123",v.empdob("123"));
		assertEquals(0,v.empsalary(0));
		assertEquals("Engineer",v.emprole("Engineer"));
		assertEquals("BMW",v.empcar("BMW"));
}
}
