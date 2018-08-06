package Com.Stackroute.Demo.PE2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestCs2 {
	private static Maincode2 value;
	
	@BeforeClass
	public static void setup() {
		
			// This methods runs, before running any one of the test case
			// This method is used to initialize the required variables
			value = new Maincode2();
			}
	
	
	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		value = null;

	}
	
	@Test
	public void getisPower() {

		assertEquals( true, value.isPower(4));
	}
	@Test
	public void getisPower1() {

		assertEquals( false, value.isPower(10));
	}
	
	@Test
	public void isPowerFailure() {
		assertNotEquals(true,value.isPower(6));
		
	}
}