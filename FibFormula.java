

public class FibFormula implements IFindFib{
  public long getFib(int n){
    
    double fib;
    double a = (1 + (Math.sqrt(5)))/2.0;
    double b = (1 - (Math.sqrt(5)))/2.0;
    
    fib = Math.pow(a, n) - Math.pow(b, n);
    fib = fib/(Math.sqrt(5));

    return ((long)fib);
  }
}