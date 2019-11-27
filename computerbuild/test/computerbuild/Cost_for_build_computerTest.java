/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerbuild;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hedy
 */
public class Cost_for_build_computerTest {
    
    public Cost_for_build_computerTest() {
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
     * Test of cpu_cost method, of class Cost_for_build_computer.
     */
    @Test
    public void testCpu_cost() {
        System.out.println("cpu_cost");
        Cost_for_build_computer instance = new Cost_for_build_computerImpl();
        instance.cpu_cost();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gpu_cost method, of class Cost_for_build_computer.
     */
    @Test
    public void testGpu_cost() {
        System.out.println("gpu_cost");
        Cost_for_build_computer instance = new Cost_for_build_computerImpl();
        instance.gpu_cost();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moniter_cost method, of class Cost_for_build_computer.
     */
    @Test
    public void testMoniter_cost() {
        System.out.println("moniter_cost");
        Cost_for_build_computer instance = new Cost_for_build_computerImpl();
        instance.moniter_cost();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class Cost_for_build_computerImpl implements Cost_for_build_computer {

        public void cpu_cost() {
        }

        public void gpu_cost() {
        }

        public void moniter_cost() {
        }
    }
    
}
