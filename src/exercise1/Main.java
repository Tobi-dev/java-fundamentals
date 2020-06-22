package exercise1;

import exercise2.Calculator;
import exercise3.Counter;
import exercise4.Fizzbuzz;
import exercise5.Fibonacci;
import exercise6.Bankautomat;
import exercise6.Bankautomat_with_exceptions;

public class Main {

    // Exercise 1
    public static void main(String[] args) {

        // Exercise 2
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5, 10));
        System.out.println(calculator.sub(10, 5));
        System.out.println(calculator.multiply(10, 5));
        System.out.println(calculator.divide(100, 5));

        // Exercise 3

        Counter counter = new Counter(5, 10);

        // Exercise 4

        Fizzbuzz fizzbuzz = new Fizzbuzz();
        fizzbuzz.startFizzbuzz(1, 100);

        //Exercise 5
        Fibonacci fibonacci = new Fibonacci();;
        fibonacci.startFibonacci(20);

        // Exercise 6
        Bankautomat_with_exceptions bankautomat_with_exceptions = new Bankautomat_with_exceptions(5000);

        bankautomat_with_exceptions.withdrawMoney(1001);

    }
}
