package com.company.kctofel;

public class QuadraticDriver {

    public static void main(String[] args) {

    Quadratic equation1 = new Quadratic(-4, 2, 1);
    Quadratic equation2 = new Quadratic();

    equation1.getRoots();
    equation2.getRoots();

    equation1.getDerivative();
    equation2.getDerivative();

    System.out.println(equation1.toString());
    System.out.println(equation2.toString());



    }
} // end QuadraticDriver
