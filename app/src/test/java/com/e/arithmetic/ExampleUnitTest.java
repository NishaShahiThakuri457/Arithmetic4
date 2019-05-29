package com.e.arithmetic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testAddition()
    {
        Arithmetic arithmetic=new Arithmetic();
        float expectedResult=10;
        float actualResult=arithmetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSubtraction()
    {
        Arithmetic arithmetic=new Arithmetic();
        float expectedResult=10;
        float actualResult=arithmetic.subtract(4,6);
        assertEquals(expectedResult,actualResult);
    }

}