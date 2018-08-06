package Com.Stackroute.Demo.PE2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestCs1 {
	private static MainCode1 palind;
	
	@BeforeClass
	public static void checkValue() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		palind = new MainCode1();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		palind = null;
	}
	
	
	@Test
	public void testcheckValue() {

		assertEquals(true, palind.checkValue("kanak"));

	}
	@Test
	public void testGetFileNameFailure() {
		assertNotEquals(false, palind.checkValue("kanak"));
	}
	
	
	
}
