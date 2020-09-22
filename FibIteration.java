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
    int lastCell = 1;
    for(int i = 2; i <= (n - 1); i++){
      fibNums[i] = fibNums[i-1] + fibNums[i-2];
      lastCell++;
    }
    return fibNums[lastCell];
  }
}