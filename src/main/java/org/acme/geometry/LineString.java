package org.acme.geometry;

import java.util.List;

public class LineString implements Geometry{

    private List<Point> points;

    public LineString() {
        this.points = null;
    }

    /*
    public LineString(List<Point> points) {
        assert (points !=) null);
        assert ! hasEmptyPoints(points);
        this.points = points;
    }


    private boolean hasEmptyPoints(List<Point> points) {
        for (Point point : points) {
            if (point.isEmpty()) {
                return true;
            }
        }
    }
    */

    public int getNumPoints(){
        return points.size();
    }

    public Point getPointN(int n){
        return points.get(n);
    }

    @Override
    public String getType() {
        return "LineString";
    }

}