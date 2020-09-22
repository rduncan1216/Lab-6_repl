import java.util.Scanner;


class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int myFib = 0;

    FibIteration testIteration = new FibIteration();

    FibFormula testFormula = new FibFormula();

    System.out.println();
    System.out.print("Enter the number you want to find the Fibonacci Series for: ");
    myFib = sc.nextInt();
    System.out.println();
        System.out.println("The Fibonacci value at position " + myFib + " using iteration is " + testIteration.getFib(myFib));
    System.out.println();
        System.out.println("The Fibonacci value at position " + myFib + " using a formula is " + testFormula.getFib(myFib));
  }
}