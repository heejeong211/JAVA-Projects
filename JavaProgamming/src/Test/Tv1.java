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
		System.out.println(brand + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
}
