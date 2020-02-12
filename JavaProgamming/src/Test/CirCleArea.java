package Test;
// 변수, PI, area;
public class CirCleArea {

	double radius;
	
	CirCleArea(double radius) {
		if(radius < 0) { //예외처리
			System.out.println("음수는 안됩니다.");
			//return;
		} else {
		this.radius = radius; // this는 자기 자신을 말하는 것.
		}
	}
	
	double getArea() {
		return radius * radius * Math.PI; //Math.PI는 클래스.변수명 (static이라 가능)
	}

}
