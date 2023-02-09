package com.tomgregory;
public class Calculator {

    public int add(int a, int b) {
        // this class is for adding
        return a + b;
    }

    public double subtract(double a, double b) {
        // this chetan 
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
  
  public double divide1(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}





