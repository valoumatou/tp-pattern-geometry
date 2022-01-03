package org.acme.geometry;

public class Coordinate {


    private double x;
    private double y;

    public void Coordinate() {
        double x = 0.0;
        double y = 0.0;
    }

    public void Coordinate(double x, double y);

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }


}
