package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry{
	
    private List<Point> points;

    public LineString() {
        this.points = new ArrayList<Point>();
        this.points.add(new Point());
    }

    public LineString(List<Point> points) {
        this.points = points;
    }
    
    @Override
    public String getType() {
        return "LineString";
    }

        public int getNumPoints(){
        return points.size();
    }

    public Point getPointN(int p){
        return points.get(p);
    }


    
}