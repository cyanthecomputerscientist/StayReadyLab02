package com.codedifferently;

public class Calculator {
   private double curval;

    double add(double value)
    {
        return curval+=value; 
    }
    double subtract(double value)
    {
        return curval -= value;
    }
    double multiply(double value)
    {
        curval = curval * value;
        return curval;
    }
    double divide(double value)
    {
        if(value==0)
        {
            return -1.0;
        }
        curval = curval/ value;
        return curval;
    }
    void clear()
    {
        this.curval = 0.0;
    }
    void setCurrentValue(double value)
    {
        curval =value; 
    }
    double getCurrentValue()
    {
        return this.curval;
    }
    double negate(double value)
    {
        value = value * -1;
        return value;
    }
}