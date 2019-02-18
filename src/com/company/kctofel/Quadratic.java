package com.company.kctofel;

public class Quadratic {

    private double a, b, c, root1, root2;
    private double[] roots new double[]

    // default constructor (calling setters)
    public Quadratic (){

        setVariables(1.0,1.0,0.0);
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

    // [list of doubles] real root
    public getRoots();

    // [list of doubles] complex root

} // end Quadratic
