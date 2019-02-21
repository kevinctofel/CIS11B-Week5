/**
 * Class for a quadratic equation that calculates
 * both real and complex roots and the derivative
 * at any point on the line
 *
 * Kevin C. Tofel
 * February 21, 2019
 *
 */
package com.company.kctofel;

import org.apache.commons.math3.complex.Complex; // used to calculate and display complex numbers
import org.apache.commons.math3.complex.ComplexFormat; // needed to format a complex object
import java.text.NumberFormat;
import java.util.Arrays;

public class Quadratic {

    private double a, b, c;

    /**
     * Quadratic equation object with three parameters
     * This is for the default constructor
     */
    public Quadratic() {

        setVariables(4.0, 5.0, 6.0);
    }

    /**
     * Quadratic equation object with three parameters
     * This is for user input values
     *
     * @param a is a double value for a
     * @param b is a double value for b
     * @param c is a double value for c
     */
    public Quadratic(double a, double b, double c) {
        setVariables(a, b, c);
    }

    /**
     * Sets variable for any Quadratic equation object
     *
     * @param a is a double value for a
     * @param b is a double value for b
     * @param c is a double value for c
     */
    public void setVariables(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method to get the value of a for a Quadratic object
     * @return a double value for a
     */
    public double getA() {
        return this.a;
    }

    /**
     * Method to get the value of b for a Quadratic object
     * @return a double value for b
     */
    public double getB() {
        return this.b;
    }

    /**
     * Method to get the value of c for a Quadratic object
     * @return a double value for c
     */
    public double getC() {
        return this.c;
    }

    /**
     * Method to test if a number is real
     * based on value of discriminant
     *
     * @return a boolean indicating real or not real
     */
    public boolean isReal() {
        if (this.getDiscriminant() >= 0)
            return true;
        else
            return false;
    }

    /**
     * Method to test if a number is complex
     * based on value of discriminant
     *
     * @return a boolean indicating complex or not complex
     */
    public boolean isComplex() {
        if (this.getDiscriminant() < 0.0)
            return true;
        else
            return false;
    }

    /** Method to test if discriminant is negative
     *
     * @return a boolean indicating negative or non-negative
     */
    public boolean isDiscriminantNeg() {

        if (this.getDiscriminant() < 0)
            return true;
        else
            return false;
    }

    /**
     * Method to calculate the discriminant
     *
     * @return double value of the discriminant
     */
    public double getDiscriminant() {
        return Math.pow((this.b), 2.0) - (4 * this.a * this.c);
    }

    /**
     * Method to calculate the first derivative at any
     * point on a parabola
     *
     * @param point a double representing the point user
     *              wants the slope
     * @return a double equal to the slope of the line at a specific point
     */
    public double getDerivative(double point) {

        return (2 * (this.a) * (point) + this.b);

    }

    /**
     * Method to calculate both roots of a quadratic equation,
     * regardless of real or complex number
     *
     * @return an array comprised of two real or complex numbers
     *
     */
    public Complex[] getRoots() {

        Complex[] roots = new Complex[2]; // array to hold a pair of real or complex numbers

        if (!(isDiscriminantNeg())) { // Positive discriminant
            double realRoot1 = (-(this.b) - Math.sqrt(getDiscriminant())) / (2 * this.a);
            double realRoot2 = (-(this.b) + Math.sqrt(getDiscriminant())) / (2 * this.a);
            Complex first = new Complex(realRoot1, 0);
            Complex second = new Complex(realRoot2, 0);
            roots[0] = first;
            roots[1] = second;
        } else {
            Complex first = new Complex(-b / (2 * a), Math.sqrt(-this.getDiscriminant()) / (2 * a));
            Complex second = new Complex(-b / (2 * a), -Math.sqrt(-this.getDiscriminant()) / (2 * a));

            roots[0] = first;
            roots[1] = second;
        }

        return roots;
    } // end getRoots


    /**
     * Method to format complex numbers
     * @param roots is an array of two complex or real numbers
     * @return a string formatted properly for real or complex numbers
     *          with up to five points of precision
     */
    public String formatComplex(Complex[] roots){

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(5); // formatting to 5 digits
        nf.setMaximumFractionDigits(5);
        ComplexFormat cf = new ComplexFormat(nf);

        String s = cf.format(roots[0]) + " and " + cf.format(roots[1]); // concatenate both formatted numbers

        return s;

    }

    /**
     * Method to show all information about the Quadratic object
     * including details on the discriminant, roots and deriviative
     * @param x is the user defined point on a parabola for the slope
     * @return a fully formatted string with all information about the Qudratic
     */
    public String toString(double x) {
        String output;
        output = "y = " + this.a + "x^2 + " + this.b + "x + " + this.c + "\n";
        if (isReal()) {
            output += "The roots are real because the discriminant is positive.\n";
            output += "Roots are: " + Arrays.toString(this.getRoots()) + "\n";
            output += "Derivative when x = " + x + " is: " + this.getDerivative(x);
        } else if (isComplex()) {
            output += "The roots are complex because the discriminant is negative.\n";
            output += "Roots are: " + formatComplex(this.getRoots()) + "\n";
            output += "Derivative when x = " + x + " is: " + this.getDerivative(x);
        }
        return output;
    }
} // end Quadratic


