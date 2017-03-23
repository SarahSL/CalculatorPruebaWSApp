/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author entrar
 */
public class CalculatorWSTest {
    
    public CalculatorWSTest() {
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
     * Test of hello method, of class CalculatorWS.
     */
    @Test
    public void testHello() throws Exception {
        System.out.println("hello");
        String txt = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CalculatorWS instance = (CalculatorWS)container.getContext().lookup("java:global/classes/CalculatorWS");
        String expResult = "";
        String result = instance.hello(txt);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
