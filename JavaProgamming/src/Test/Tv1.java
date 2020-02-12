package Test;

public class Tv1 {
	
	String brand;
	int year;
	int inch;
	
	Tv1(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
