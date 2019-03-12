/**
 * Driver file to test Quadratic class with
 * user input for either a, b, c values or
 * default constructor.
 *
 * Sort quadratics based on rate of opening
 *
 * Kevin C. Tofel
 * February 21, 2019
 * Upated March 11, 2019
 *
 */

package com.company.kctofel;
import java.util.Arrays;


public class QuadraticDriver {

    public static void main(String[] args) {

        double a, b, c;

        // Create five quadratics
        Quadratic equation = new Quadratic();
        Quadratic equation2 = new Quadratic(3, 2, -4);
        Quadratic equation3 = new Quadratic(2.5, 4.7, 2.6);
        Quadratic equation4 = new Quadratic(.03, 2.1, -3.7);
        Quadratic equation5 = new Quadratic(7.2,5.2, 2.5);

        // Gather them into an array
        Quadratic[] formulas = {equation, equation2, equation3, equation4, equation5};

        // Sort the quadratics based on speed of opening
        Arrays.sort(formulas);

        // For testing only: display the equations in order of sort
        for (Quadratic elements : formulas) {
            System.out.println("y = " + elements.a + "x^2 + " + elements.b + "x + " + elements.c);
        }
    }
} // end QuadraticDriver
