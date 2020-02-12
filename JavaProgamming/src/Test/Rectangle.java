package Test;

public class Rectangle implements IArea {
	
	
	private double height;
	private double width;


	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	

	@Override
	public double area() {

		return height*width;
	}

}
