package ec.edu.espe.renta.operation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Miquely Calvopiña
 * @version 0.9
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of impRenta method, of class Operation.
     */
    @Test
    public void testImpRenta() {
        System.out.println("impRenta");
        float salary = 570F;
        Operation instance = new Operation();
        float expResult = 0F;
        float result = instance.impRenta(salary);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("impRenta");
        salary = 1100F;
        expResult = 96.5F;
        result = instance.impRenta(salary);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("impRenta");
        salary = 1450F;
        expResult = 459F;
        result = instance.impRenta(salary);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");

        System.out.println("impRenta");
        salary = 1650F;
        expResult = 736F;
        result = instance.impRenta(salary);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");        
        
        System.out.println("impRenta");
        salary = 2525;
        expResult = 2258.5F;
        result = instance.impRenta(salary);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");   
        
        System.out.println("impRenta");
        salary = 4260F;
        expResult = 5782F;
        result = instance.impRenta(salary);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("impRenta");
        salary = 6524F;
        expResult = 11898.5F;
        result = instance.impRenta(salary);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD"); 

        System.out.println("impRenta");
        salary = 8974F;
        expResult = 20324.4F;
        result = instance.impRenta(salary);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");       
        
        System.out.println("impRenta");
        salary = 11546F;
        expResult = 30735.19921875F;
        result = instance.impRenta(salary);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");    
        
        
           
    }
    
}
