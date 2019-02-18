package com.company.kctofel;

public class QuadraticDriver {

    public static void main(String[] args) {

    Quadratic equation1 = new Quadratic(2, 4, 1);
    Quadratic equation2 = new Quadratic();

    System.out.println(equation1.getDiscriminant());
    System.out.println(equation2.getDiscriminant());

    equation1.getRoots();
    equation2.getRoots();

    System.out.println(equation1.toString());
    System.out.println(equation2.toString());



    }
} // end QuadraticDriver
