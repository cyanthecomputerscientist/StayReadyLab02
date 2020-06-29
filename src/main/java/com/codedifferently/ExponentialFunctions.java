package com.codedifferently;

public class ExponentialFunctions {
    private double value;    
    
    double getValue()
    {
        return value;
    }
    void setValue(double val)
    {
        this.value = val;
    }
    double powerOf(double val, double power)
    {
        return Math.pow(val, power);
    }
    double squareRootOF(double val)
    {
        return Math.sqrt(val);
    }
    double cubedRootOf(double val)
    {
        return Math.cbrt(val);
    }
    double commonLogOf(double val)
    {
        return Math.log10(val);
    }
    double naturalLogOf(double val)
    {
        return Math.log(val);
    }
    double expFunction(double power)
    {
        return Math.exp(power);
    }
}