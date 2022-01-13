/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorsmp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
<<<<<<< HEAD
 * @author Eliot
=======
 * @author rsgar
>>>>>>> 67ae55b59fbc140193859314ecaf3bb0304ed8f5
 */
public class OperationsTest {
    
    public OperationsTest() {
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
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String expResult = Operations.MakeFormula();
        String result = Operations.MakeFormula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Solve method, of class Operations.
     */
    @Test
    public void testSolve() {
        System.out.println("Solve");
        String formula = Operations.MakeFormula();
        String expResult = Operations.Solve(formula);
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
