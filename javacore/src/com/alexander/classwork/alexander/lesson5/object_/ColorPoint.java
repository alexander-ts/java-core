package com.alexander.classwork.alexander.lesson5.object_;

public class ColorPoint extends Point {
	final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	// Broken - violates symmetry!
	/*@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint))
			return false;
		return super.equals(o) && ((ColorPoint) o).color == color;
	}*/

	// Broken - violates transitivity!
	//@Override
	public boolean equals2(Object o) {
		if (!(o instanceof Point))
			return false;

		// If o is a normal Point, do a color-blind comparison
		if (!(o instanceof ColorPoint))
			return o.equals(this);

		// o is a ColorPoint; do a full comparison
		return super.equals(o) && ((ColorPoint) o).color == color;
	}

	public static void main(String[] args) {
		
		Point p = new Point(1, 2);
		ColorPoint cp = new ColorPoint(1, 2, Color.RED);		
		System.out.println(p.equals(cp) + " " + cp.equals2(p));
		
		//System.out.println(cp2.equals(cp) + " " + cp.equals(cp2));
		
		/*ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
		System.out.printf(p1.equals(p2)+" "+ p2.equals(p3)+" "+p1.equals(p3));*/
	}
	
	
	
}
