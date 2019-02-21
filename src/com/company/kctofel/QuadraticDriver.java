/**
 * Driver file to test Quadratic class with
 * user input for either a, b, c values or
 * default constructor. User input for derivative
 * to calculate it at any point
 *
 * Kevin C. Tofel
 * February 21, 2019
 * Test comment
 *
 */

package com.company.kctofel;
import java.util.Scanner;

public class QuadraticDriver {

    public static void main(String[] args) {

        double a, b, c, point;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type D to use default values, C to input custom values.");
        String input = keyboard.next();

        if (input.equals("D")) {

            Quadratic equation = new Quadratic();
            System.out.println("Enter an X value for the derivative");
            input = keyboard.next();
            point = Double.parseDouble(input);
            System.out.println(equation.toString(point));
        }

        else if (input.equals("C")){ // ran out of time to make this a short 3 iteration loop!

            System.out.println("Enter a value for a.");
            input = keyboard.next();
            a = Double.parseDouble(input);
            System.out.println("Enter a value for b.");
            input = keyboard.next();
            b = Double.parseDouble(input);
            System.out.println("Enter a value for c.");
            input = keyboard.next();
            c = Double.parseDouble(input);
            System.out.println("Enter an X value for the derivative");
            input = keyboard.next();
            point = Double.parseDouble(input);
            Quadratic equation = new Quadratic(a, b, c);
            System.out.println(equation.toString(point));

        }

    }
} // end QuadraticDriver
