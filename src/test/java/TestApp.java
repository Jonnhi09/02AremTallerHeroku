/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.escuelaing.arem.app.App;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonnhi
 */
public class TestApp {

    private final String numbersSet1;
    private final String numbersSet2;

    public TestApp() {
        numbersSet1 = "160,591,114,229,230,270,128,1657,624,1503";
        numbersSet2 = "15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2";
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

    @Test
    public void calcularMediaColumna1() {
        App.calculate(numbersSet1);
        assertTrue(App.getMean() == 550.6f);
    }

    @Test
    public void calcularDesviacionEstandarColumna1() {
        App.calculate(numbersSet1);
        assertTrue(App.getStandardDeviation() == 572.03f);
    }

    @Test
    public void calcularMediaColumna2() {
        App.calculate(numbersSet2);
        assertTrue(App.getMean() == 60.32f);
    }

    @Test
    public void calcularDesviacionEstandarColumna2() {
        App.calculate(numbersSet2);
        assertTrue(App.getStandardDeviation() == 62.26f);
    }
}
