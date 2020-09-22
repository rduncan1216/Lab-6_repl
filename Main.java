//Name: Ryan Duncan

//Course: CSE 1322 Lab W01

//Date: 9/22/2020

//Lab6

//driver program
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    
    Scanner sc = new Scanner(System.in);
    int myFib = 0;

    //create new objects for interation and formula
    FibIteration testIteration = new FibIteration();

    FibFormula testFormula = new FibFormula();


    //take user input for fib calc
    System.out.println();
    System.out.print("Enter the number you want to find the Fibonacci Series for: ");
    myFib = sc.nextInt();
    System.out.println();

    //calculate fib output using getFib from my interface
    System.out.println("The Fibonacci value at position " + myFib + " using iteration is " + testIteration.getFib(myFib));
    System.out.println();
    System.out.println("The Fibonacci value at position " + myFib + " using a formula is " + testFormula.getFib(myFib));
  }
}