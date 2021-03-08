package modularization.application.core;


import operation.Calculator;



public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(5,6));
        System.out.println(calculator.div(8,3));
        System.out.println(calculator.sub(9,3));
        System.out.println(calculator.multi(9,3));




    }
}
