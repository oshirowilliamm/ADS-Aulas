import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoTest {
    
    Calculo calc;   
    
    public CalculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calc = new Calculo();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMedia() {
        assertEquals(5, calc.Media(5, 7), 1);
    }

    @Test
    public void testMaiorNum() {
        assertEquals(5, calc.MaiorNum(2, 10, 8));
    }

    @Test
    public void testPar() {
        assertEquals(true, calc.Par(5));
    }
    
}
