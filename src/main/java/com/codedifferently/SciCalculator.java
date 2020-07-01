package com.codedifferently;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SciCalculator 
{
    
    public static void main( String[] args )
    {
        TrigFunctions tFunctions = new TrigFunctions();
        Calculator calc = new Calculator();
        ExponentialFunctions expfunct = new ExponentialFunctions();

        System.out.println("Welcome to My calculator");
        
        // YOU ONLY NEEED ONE YOU GREEDY LIL CODER
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter A Value");
        calc.setCurrentValue(scan.nextDouble());
        System.out.println("The current value is :");
        System.out.println(calc.getCurrentValue());

       System.out.println("Please select an operation");   
        String s = scan.next();
        System.out.println(s);
        double value; 

        switch(s){
            case "+": 
                value = scan.nextDouble();
                calc.setCurrentValue(calc.add(value));
                System.out.println(calc.getCurrentValue());
                break;
            case "-":
                System.out.println("Please Enter a value to subtract");
                value = scan.nextDouble();
                calc.setCurrentValue(calc.subtract(value));
                System.out.println(calc.getCurrentValue());
                break;
            case "/":
                System.out.println("Please enter value to divide");
                 value = scan.nextDouble();
                if(value==0)
                {
                    System.err.println("Value undefined");
                }
                else
                {
                    calc.setCurrentValue(calc.divide(value));
                    System.out.println(calc.getCurrentValue());
                }
                break;
                case "*":
                    System.out.println("Please Enter a value to multiply");
                    value = scan.nextDouble();
                    calc.setCurrentValue(calc.multiply(value));
                    System.out.print(calc.getCurrentValue());
                    break;
                case "-()":
                    
                    calc.setCurrentValue(calc.getCurrentValue());  
                    System.out.println(calc.getCurrentValue());
                    break;
                case "x^n":
                    System.out.println("Please select to what power to calculate to");
                    double power = scan.nextDouble();
                    calc.setCurrentValue(expfunct.powerOf(calc.getCurrentValue(), power));
                    System.out.println(calc.getCurrentValue());
                    break;
                case "e^n":
                    System.out.println("Please select what power to calculate to");
                    value = scan.nextDouble();
                    calc.setCurrentValue(expfunct.expFunction(value));
                    System.out.println(calc.getCurrentValue());
                    break;
                case "sqrt":
                    value = calc.getCurrentValue();
                    calc.setCurrentValue(expfunct.squareRootOF(value));
                    System.out.println(calc.getCurrentValue());
                    break;
                case "cbrt":
                    value = calc.getCurrentValue();
                    calc.setCurrentValue(expfunct.cubedRootOf(value));
                    System.out.println(calc.getCurrentValue());
                    break;
                case "log10":
                     value = calc.getCurrentValue();
                     calc.setCurrentValue(expfunct.commonLogOf(value));
                     System.out.println(calc.getCurrentValue());
                    break;
                case "loge":
                    value = calc.getCurrentValue();
                    calc.setCurrentValue(expfunct.naturalLogOf(value));
                    System.out.println(calc.getCurrentValue());
                    break; 
                case "sine":
                    value = calc.getCurrentValue();
                    calc.setCurrentValue(tFunctions.sine(value));
                    System.out.println(calc.getCurrentValue());
                    break; 
                case "cossine":
                    value = calc.getCurrentValue();
                    calc.setCurrentValue(tFunctions.cosine(value));
                    System.out.println(calc.getCurrentValue());
                    break;
                case "tangent":
                    value = calc.getCurrentValue();
                    calc.setCurrentValue(tFunctions.tanget(value));
                    System.out.println(calc.getCurrentValue());
                    break;
                case "arcsine":
                    value = calc.getCurrentValue();
                    calc.setCurrentValue(tFunctions.arcsine(value));
                    System.out.println(calc.getCurrentValue());
                    break;
                case "arccosine":
                     value = calc.getCurrentValue();
                    calc.setCurrentValue(tFunctions.arccosine(value));
                    System.out.println(calc.getCurrentValue()); 
                     break;
                case "arctanget":
                    value = calc.getCurrentValue();
                    calc.setCurrentValue(tFunctions.arctan(value));  
                    System.out.println(calc.getCurrentValue());
                    break;                            
                    }
                scan.close();

       /*
        
        else if(s.equals("arctan"))
        {
            double val = calc.getCurrentValue();
            calc.setCurrentValue(tFunctions.arctan(val));
            System.out.println(calc.getCurrentValue());
        }
    }
    */
    }   
}
