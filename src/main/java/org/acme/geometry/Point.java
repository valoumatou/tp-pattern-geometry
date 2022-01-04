package org.acme.geometry;

public class Point implements Geometry{

    public static final String Type = "Point";
    
    private Coordinate coordinate;

    public Point() {
        this.coordinate = new Coordinate();
    }

    public Point(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String getType() {
        return "Point";
    }

    @Override
    public boolean isEmpty() {
        return Double.isNaN(coordinate.getX());
    }

    @Override
    public void translate(double xt, double yt) {
        double nwX = this.coordinate.getX() + xt;
        double nwY = this.coordinate.getY() + yt;
        this.coordinate = new Coordinate(nwX, nwY);
    }
}