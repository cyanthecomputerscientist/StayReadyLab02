package com.codedifferently;

public class Calculator {
   public double value;
   public double curval;

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
        curval = curval/ value;
        return curval;
    }
    void clear()
    {
        curval = 0.0;
    }
    void setCurrentValue(double value)
    {
        curval =value; 
    }
    double negate(double value)
    {
        value = value * -1;
        return value;
    }
}