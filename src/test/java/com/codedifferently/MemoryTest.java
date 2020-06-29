package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {
        @Test
        public void addToMemoryTest()
        {
            //Given
            double val = 10;
            //When
            Memory memory = new Memory();
            memory.addToMemory(val);
            double expected = val;
            double actual = memory.memVal;
            //Then
            Assert.assertEquals(expected, actual, .1);
        }
        @Test
        public void resetMemoryTest()
        {
           //Given 
           double val = 10.0;
           //When
           Memory memory = new Memory();
           memory.memVal = val; 
           memory.resetMemory();
           double expected = 0.0;
           double actual = memory.memVal;
           //Then
           Assert.assertEquals(expected, actual, .1);
        }
        @Test
        public void retrieveMemoryTest()
        {
         //Given 
         double val= 10;
         Memory memory = new Memory();
         memory.addToMemory(val);
         //When
         memory.retrievememory();
         double expected = val; 
         double actual = memory.memVal;
         //Then
         Assert.assertEquals(expected, actual, .1);
        }
        @Test
        public void subtractMemoryTest()
        {
            //Given
            double val = 5;
            Memory memory = new Memory();
            //When
            memory.memVal = val; 
            memory.memorySubtract();
            double expected = 0.0;
            double actual = memory.memVal;
            //Then
            Assert.assertEquals(expected, actual, .1);
        }
}