package Com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class EmployeeTest {

	@Test
	
	public void Show() {
	
		Ammu a = new Ammu();
 
		assertEquals(0,a.empid(0));
		assertEquals("Surya",a.empname("Surya"));
		assertEquals(0,a.empage(0));
		assertEquals("White",a.empcolor("White"));
		assertEquals("123",a.empdob("123"));
		assertEquals(15000,a.empsalary(15000));
		assertEquals("Engineer",a.emprole("Engineer"));
		assertEquals("BMW",a.empcar("BMW"));
		
	}
}