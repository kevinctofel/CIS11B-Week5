package com.company.kctofel;

public class Quadratic {

    private double a, b, c, x, y;

    // default constructor (calling setters)
    public Quadratic (){

        setVariables(1.0,1,0,0.0);
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
    }
// getters

    // boolean isRoot real

    // boolean isRoot complex

    // boolean isDiscriminant negative

    // double firstDerivative (slope)

    // [list of doubles] real root

    // [list of doubles] complex root

} // end Quadratic
