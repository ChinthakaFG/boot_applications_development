package com.fg.boot.interview;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/3/17 Time : 8:31 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : CalculationTest
 */
public class CalculationTest {

    private int firstNumber = 0;
    private int secondNumber = 0;

    @Before
    public void setUp() throws Exception {
        firstNumber = 90;
        secondNumber = 60;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() throws Exception {
        Calculation.add(firstNumber, secondNumber);
    }

    @Test
    public void sub() throws Exception {
        Calculation.sub(firstNumber, secondNumber);
    }

}