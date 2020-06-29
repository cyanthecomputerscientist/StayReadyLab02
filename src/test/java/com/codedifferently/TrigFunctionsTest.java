package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionsTest {
    
    @Test
    public void sineTest()
    {
        //Given
        double val = (Math.PI)/2;
        //When
        TrigFunctions trigfunc = new TrigFunctions();
        trigfunc.value = val; 
        double expectedvalue = Math.sin(trigfunc.value);
        double actualvalue = trigfunc.sine(trigfunc.value);
        //Then
        Assert.assertEquals(expectedvalue, actualvalue, .1);
    }
    @Test
    public void cosineTest()
    {
         //Given
         double val = 0.0;
         //When
         TrigFunctions trigfunc = new TrigFunctions();
         trigfunc.value = val; 
         double expectedvalue = Math.cos(trigfunc.value);
         double actualvalue = trigfunc.cosine(trigfunc.value);
         //Then
         Assert.assertEquals(expectedvalue, actualvalue, .1);

    }
    @Test
    public void tangentTest()
    {
         //Given
         double val = (Math.PI)/4;
         //When
         TrigFunctions trigfunc = new TrigFunctions();
         trigfunc.value = val; 
         double expectedvalue = Math.tan(trigfunc.value);
         double actualvalue = trigfunc.tanget(trigfunc.value);
         //Then
         Assert.assertEquals(expectedvalue, actualvalue, .1);
    }
    @Test
    public void arcsine()
    {
         //Given
         double val = 1.0;
         //When
         TrigFunctions trigfunc = new TrigFunctions();
         trigfunc.value = val; 
         double expectedvalue = Math.asin(trigfunc.value);
         double actualvalue = trigfunc.arcsine(trigfunc.value);
         //Then
         Assert.assertEquals(expectedvalue, actualvalue, .1);
    }
    @Test
    public void arccosine()
    {
         //Given
         double val = 0.0;
         //When
         TrigFunctions trigfunc = new TrigFunctions();
         trigfunc.value = val; 
         double expectedvalue = Math.acos(trigfunc.value);
         double actualvalue = trigfunc.arccosine(trigfunc.value);
         //Then
         Assert.assertEquals(expectedvalue, actualvalue, .1);
    }
    @Test
    public void arcTangent()
    {
         //Given
         double val = 1.0;
         //When
         TrigFunctions trigfunc = new TrigFunctions();
         trigfunc.value = val; 
         double expectedvalue = Math.atan(trigfunc.value);
         double actualvalue = trigfunc.arctan(trigfunc.value);
         //Then
         Assert.assertEquals(expectedvalue, actualvalue, .1);
    }

}