package Com.Stackroute.Demo.PE2;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

	public class MemVarTest {
	
	
    private static MemVarTest obj;
    
    @BeforeClass
    public static void setup() {
        obj = new MemVarTest();
    }
    
    @AfterClass
    public static void teardown() {
        obj = null;
    }
    @Test
    public void getMemVarTest() {
        MemberVariable ob = new MemberVariable();
        assertArrayEquals(new Object[] {"Harry Potter", 30 ,2500.3}, ob.getMemVar("Harry Potter", 30 ,2500.3));
        
        assertNotNull(ob.getMemVar("Harry Potter", 30 ,2500.3));

        assertNull(null, ob.getMemVar(null, 0, 0));
    }
}
