package Com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class MikeTest {

@Test
	
	public void show() {
		Mike n = new Mike();
		
		assertEquals(0,n.empid(0));
		assertEquals("Surya",n.empname("Surya"));
		assertEquals(0,n.empage(0));
		assertEquals("White",n.empcolor("White"));
		assertEquals("123",n.empdob("123"));
		assertEquals(0,n.empsalary(0));
		assertEquals("Engineer",n.emprole("Engineer"));
		assertEquals("BMW",n.empcar("BMW"));
}
}
