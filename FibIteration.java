//Name: Ryan Duncan

//Course: CSE 1322 Lab W01

//Date: 9/22/2020

//Lab6


//calculate Fibonacci using simple iteration
import java.util.ArrayList;

public class FibIteration implements IFindFib{

  public long getFib(int n){
    long[] fibNums = new long[n];
    
    //first two cells are 1
    fibNums[0] = 1;
    if(n != 1)
      fibNums[1] = 1;
    if(n == 1 || n == 2)
      return 1;

    //for loop and array are not necessary here, but I used to help with testing and practice  
    int lastCell = 1;
    for(int i = 2; i <= (n - 1); i++){
      fibNums[i] = fibNums[i-1] + fibNums[i-2];
      lastCell++;
    }
    return fibNums[lastCell];
  }
}