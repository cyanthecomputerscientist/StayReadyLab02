package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class ModeTest {
    
    @Test
    public void radianModeTest()
    {
        //Given
        double val = 90.0;
        //When
        Mode mod = new Mode();
        mod.val = val; 
       mod.val = mod.radiansMode(mod.val);
        double expectedvalue = (Math.PI)/2;
        double actualvalue = mod.val;
        //Then
        Assert.assertEquals(expectedvalue, actualvalue, .1);
    }
    @Test
    public void degreeModeTest()
    {
        //Given
        double val = Math.PI;
        //When
        Mode mod = new Mode();
        mod.val =val; 
        mod.val=mod.degreeMode(mod.val);
        double expectedvalue = 180;
        double actualvalue = mod.val;
        //Then
        Assert.assertEquals(expectedvalue, actualvalue, .1);
    }
    @Test
    public void binaryModeTest()
    {
        //Given
        double val = 2.0;
        //When
        Mode mod = new Mode();
        mod.val = val; 
        mod.binaryMode(mod.val);
        double expectedvalue = 10; 
        double actualvalue = mod.val;
        //Then
        Assert.assertEquals(expectedvalue, actualvalue, .1);
    }
    @Test
    public void hexadecimalModeTest()
    {
        //Given
        double val = 16;
        //When
        Mode mod = new Mode();
        mod.val = val;
        mod.binaryMode(mod.val);
        double expectedvalue = 10;
        double actualvalue = mod.val; 
        //Then
        Assert.assertEquals(expectedvalue, actualvalue, .1);
    }
    @Test
    public void octalModeTest()
    {
        //Given
        double val = 16;
        //When
        Mode mod = new Mode();
        mod.val = val;
        mod.octalMode(mod.val);
        double expectedvalue = 20;
        double actualvalue = mod.val; 
        //Then
        Assert.assertEquals(expectedvalue, actualvalue, .1);

    }
}