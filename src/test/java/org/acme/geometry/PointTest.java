package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    public static final double EPSILON = 1.0e-15;

    @Test
    public void testDefaultConstructorPoint(){
		Point c = new Point();
		Assert.assertEquals(0.0, c.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(0.0, c.getCoordinate().getY(), EPSILON);
	}

	@Test
	public void testPointXY(){
        Coordinate c = new Coordinate(3.0, 4.0);
		Point p = new Point(c);
		Assert.assertEquals(3.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, p.getCoordinate().getY(), EPSILON);
	}

    @Test
    public void testTypePoint(){
        Point p = new Point();
        Assert.assertEquals("Point", p.getType());
    }

}