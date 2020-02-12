package Test;

public class Triangle implements IArea {
	 
	private double height;
	private double width;


	public Triangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	

	@Override
	public double area() {
		
		return (height*width)/2;
	}

}
