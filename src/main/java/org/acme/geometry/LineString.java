package org.acme.geometry;

import java.util.List;
import java.util.ArrayList;

public class LineString implements Geometry{
	
    private List<Point> points;

    public LineString() {
        this.points = new ArrayList<Point>();
    }

    public LineString(List<Point> points) {
        this.points = points;
    }
    
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
    
    @Override
    public boolean isEmpty() {
        return this.points.isEmpty();
    }
    
    @Override
    public void translate(double xt, double yt) {
        for (Point point : points){
            point.translate(xt, yt);
        };
    }

    @Override
    public LineString clone() {
    	List<Point> nwPt = new ArrayList<Point>();
		for(Point point : this.points) {
			nwPt.add(point.clone());
		}
		return new LineString(nwPt);
    }

}