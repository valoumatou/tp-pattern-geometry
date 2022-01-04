package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class SampleFactory {

    public static Point createPointO(){
        return new Point(new Coordinate(3.0, 4.0));
    }

    public static Point createPointA(){
        return new Point(new Coordinate(3.2, 3.6));
    }

    public static LineString createLineStringOA(){
        List<Point> points = new ArrayList<Point>();
        points.add(createPointO());
        points.add(createPointA());
        return new LineString(points);
    }
}