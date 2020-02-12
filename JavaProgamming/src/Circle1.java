class Point1 implements Cloneable {
	int x;
	int y;
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x + ", y="+y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {}
		return obj;
	}
}


class Circle1 implements Cloneable {
	Point1 p;
	double r;
	
	Circle1(Point1 p, double r) {
		this.p = p;
		this.r = r;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}
		catch(CloneNotSupportedException e) {}
		Circle1 c = (Circle1)obj;
		c.p = new Point1(this.p.x, this.p.y);
		return obj;
		
		}
	
	public String toString() {
		return p.toString() + ", r=" + r;
	}
	

}
