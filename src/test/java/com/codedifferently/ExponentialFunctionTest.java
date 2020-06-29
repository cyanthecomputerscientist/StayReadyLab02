package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class ExponentialFunctionTest {

    @Test
    public void getValueTest()
    {
        //Given
        double val = 2.0;
        ExponentialFunctions testEfunc = new ExponentialFunctions();

        //When
        testEfunc.setValue(val);
        //Then
        double actual = testEfunc.getValue();
        double expected = val;
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void setValueTest()
    {
        //Given
        double val = 2.0;
        ExponentialFunctions testEfunc = new ExponentialFunctions();
        //When
        testEfunc.setValue(val);
        //Then
        double actual = testEfunc.getValue();
        double expected = val;
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void powerOfTest()
    {
        //Given
        double val = 2.0;
        double power = 2.0;
        ExponentialFunctions testEfucnc = new ExponentialFunctions();
        //When
        testEfucnc.setValue(val);
        double actual = testEfucnc.powerOf(val, power);
        double expected = Math.pow(val, power); 
        //then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void squareRootOf()
    {
        //Given
        double val = 4.0; 
        ExponentialFunctions testEfunc = new ExponentialFunctions();
       //When
        testEfunc.setValue(val);
        double expected = Math.sqrt(val);
        double actual = testEfunc.squareRootOF(val);
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void cubedRootOf()
    {
        //Given
        double val = 8.0; 
        ExponentialFunctions testEfunc = new ExponentialFunctions();
        //When
        testEfunc.setValue(val);
        //Then
        double expected = Math.cbrt(val);
        double actual = testEfunc.cubedRootOf(val);
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void commonLogOfTest()
    {
        //Given
        double val = 10.0;
        ExponentialFunctions testEfunc = new ExponentialFunctions();
        //When
        testEfunc.setValue(val);
        //Then 
        double expected = Math.log10(val);
        double actual = testEfunc.commonLogOf(val);
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void naturalLogOfTest()
    {
        //Given
        double val = Math.E;
        ExponentialFunctions testEfunc = new ExponentialFunctions();
        //When
        testEfunc.setValue(val);
        //Then
        double expected = Math.log(val);
        double actual = testEfunc.naturalLogOf(val);
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void expFunctionTest()
    {
        //Given
        double power = 1.0; 
        ExponentialFunctions testEfunc = new ExponentialFunctions();
        //When
        double actual = testEfunc.expFunction(power);
        double expected = Math.exp(power);
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}