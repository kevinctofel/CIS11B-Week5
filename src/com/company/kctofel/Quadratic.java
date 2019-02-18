package com.company.kctofel;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;

public class Quadratic {

    private double a, b, c, derivative;
    private double[] roots = new double[2];

    // default constructor (calling setters)
    public Quadratic (){

        setVariables(1.0,-1.0,0.0);
    }

    // constructor (calling setters)
    public Quadratic(double a, double b, double  c) {
        setVariables(a,b,c);
    }

    // void setters
    public void setVariables(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    // boolean isRoot real

    // boolean isRoot complex

    // boolean isDiscriminant negative
    public boolean isDiscriminantNeg() {

        if (this.getDiscriminant() < 0)
            return true;
        else
            return false;
    }

    // double getDiscriminant
    public double getDiscriminant() {
        return Math.pow((this.b), 2.0) - (4 * this.a * this.c);
    }

    // double firstDerivative (slope)
    public double getDerivative() {
        this.derivative = (2*(this.a)*(this.roots[0])) + this.b;
        return derivative;
    }

    // [list of doubles] real root
    public void getRoots() {

        if (!(isDiscriminantNeg())) { // Positive discriminant
            roots[0] = (-(this.b) + Math.sqrt(getDiscriminant())) / (2 * this.a);
            roots[1] = (-(this.b) - Math.sqrt(getDiscriminant())) / (2 * this.a);
        }
        else {
            roots[0] = (-(this.b) + Math.sqrt(-(getDiscriminant()))) / (2 * this.a);
            roots[1] = (-(this.b) - Math.sqrt(-(getDiscriminant()))) / (2 * this.a);
        }
    } // end getRoots


    // [list of doubles] complex root

    // String toString

    public String toString() {

        return ("Root 1: " + roots[0] + "\nRoot 2: " + roots[1] + "\nDerivative: " + derivative);
    }

} // end Quadratic
