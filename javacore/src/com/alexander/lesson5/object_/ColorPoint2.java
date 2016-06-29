package com.alexander.lesson5.object_;


public class ColorPoint2 {

	private final Point point;
	private final Color color;

	public ColorPoint2(int x, int y, Color color) {		
		point = new Point(x, y);
		this.color = color;
	}

	
	public Point asPoint() {
		return point;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint2))
			return false;
		ColorPoint2 cp = (ColorPoint2) o;
		return cp.point.equals(point) && cp.color.equals(color);
	}

	@Override
	public int hashCode() {
		return point.hashCode() * 33 + color.hashCode();
	}
	
	
	public static void main(String[] args) {
		
		Point p = new Point(1, 2);
		ColorPoint2 cp = new ColorPoint2(1, 2, Color.RED);	
		
		System.out.println(p.equals(cp) + " " + cp.equals(p));
			

		
		/*ColorPoint p1 = new ColorPoint(1, 2, Color.RED);		
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.RED);
		
		System.out.printf(p1.equals(p2)+" "+ p2.equals(p3)+" "+p1.equals(p3));
	*/}
}
