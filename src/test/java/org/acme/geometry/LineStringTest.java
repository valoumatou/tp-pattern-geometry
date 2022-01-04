package org.acme.geometry;

import java.util.List;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

	public static final double EPSILON = 1.0e-15;

	public static Point createPointO() {
		return new Point(new Coordinate());
	}

	public static Point createPointA() {
		return new Point(new Coordinate(3.0, 4.0));
	}

	@Test
	public void testDefaultConstructor() {

		LineString ls = new LineString();
		Assert.assertEquals(1, ls.getNumPoints());
	}

	@Test
	public void testConstructor() {

		List<Point> points = new ArrayList<Point>();
		points.add(createPointA());
		LineString ls = new LineString(points);
		Assert.assertEquals(1, ls.getNumPoints());
	}

	@Test
	public void pointGetTypeTest() {

		LineString ls = new LineString();
		Assert.assertEquals("LineString", ls.getType());
	}

	@Test
	public void pointGetNumTest() {

		List<Point> points = new ArrayList<Point>();
		points.add(createPointO());
		points.add(createPointA());
		LineString ls = new LineString(points);
		Assert.assertEquals(2, ls.getNumPoints(), EPSILON);
	}

	@Test
	public void ggetPointTest() {

		List<Point> points = new ArrayList<Point>();
		points.add(createPointO());
		points.add(createPointA());
		LineString ls = new LineString(points);
		Assert.assertEquals(3.0, ls.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4.0, ls.getPointN(1).getCoordinate().getY(), EPSILON);
	}

}