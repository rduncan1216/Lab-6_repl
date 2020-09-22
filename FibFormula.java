//Name: Ryan Duncan

//Course: CSE 1322 Lab W01

//Date: 9/22/2020

//Lab6


//class for calculating Fibonacci using a Binet's formula
public class FibFormula implements IFindFib{
  public long getFib(int n){
    
    double fib;
    double a = (1 + (Math.sqrt(5)))/2.0;
    double b = (1 - (Math.sqrt(5)))/2.0;
    
    fib = Math.pow(a, n) - Math.pow(b, n);
    fib = fib/(Math.sqrt(5));

    //cast return as long to match interface implementation
    return ((long)fib);
  }
}