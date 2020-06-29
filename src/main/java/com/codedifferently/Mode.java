package io.codedifferently;

public class Mode {

     int mode;
     double val; 

    void modeSelect(int mod)
    {
        this.mode = mod;
    }
    double radiansMode(double val)
    {
      double rval = Math.toRadians(val);
      val = rval;
        return val;
    }

    double degreeMode(double value)
    {
        double dval = Math.toDegrees(value);
        return dval;
    }
    
    void binaryMode(double value)
    {

    }
    void hexadecimalMode(double value)
    {

    }
    void octalMode(double value)
    {

    }
}