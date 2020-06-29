package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CaculatorTest {
    
    @Test
    public void addTest()
    {
        //Given 
        double value = 2.0; 
        double currentval = 2.0;
        Calculator calcTest = new Calculator();
        //When 
        calcTest.curval= currentval;
        //Then 
        double expectedvalue = currentval+ value;
        double actualValue = calcTest.add(value);
        Assert.assertEquals(expectedvalue, actualValue, 0.0);
    }
    @Test
    public void subtractTest()
    {
        //Given 
        double value = 2.0;
        double currentval =4.0;
        Calculator calcTest = new Calculator(); 
        //When
        calcTest.curval = currentval;
        //Then
        double expectedvalue = currentval - value;
        double actualValue = calcTest.subtract(value);
        Assert.assertEquals(expectedvalue, actualValue, 0.0);
    }
    @Test
    public void multiplicationTest()
    {
        //Given
        double value = 2.0;
        double currentval = 2.0;
        Calculator calcTest = new Calculator();
        //When 
        calcTest.curval = currentval;
        //Then
        double expectedvalue = currentval * value; 
        double actualValue = calcTest.multiply(value);
        Assert.assertEquals(expectedvalue, actualValue, 0.0);
    }
    @Test
    public void divideTest()
    {
          //Given
          double value = 2.0;
          double currentval = 2.0;
          Calculator calcTest = new Calculator();
          //When 
          calcTest.curval = currentval;
          //Then
          double expectedvalue = currentval / value; 
          double actualValue = calcTest.divide(value);
          Assert.assertEquals(expectedvalue, actualValue, 0.0);

    }
    @Test
    public void clearTest()
    {
        //Given
        double value = 2.0;
        Calculator calcTest = new Calculator();
        //When 
        calcTest.curval = value;
        calcTest.clear();
        //Then
        double expectedvalue = 0.0;
        double actualValue = calcTest.curval;
        Assert.assertEquals(expectedvalue, actualValue, 0.0);
    }
    @Test
    public void setCurrentValueTest()
    {
        //Given
        double value = 2.0;
        Calculator calcTest = new Calculator();
        //When
        calcTest.setCurrentValue(value);
        //Then
        double expectedvalue = value; 
        double actualValue = calcTest.curval;
        Assert.assertEquals(expectedvalue, actualValue, 0.0);
    }
    @Test
    public void negateTest()
    {
        //Given
        double value = 2.0;
        Calculator calcTest = new Calculator();
        //When
        calcTest.curval=value; 
        //Then
        double expectedvalue = value * -1;
        double actualValue = calcTest.negate(value);
        Assert.assertEquals(expectedvalue, actualValue, 0.0);
    }
}