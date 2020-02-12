
public class Circle {
	double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
	}
	
	// 이 함수가 중요함.
	public void setRad(double r) {
		if(r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	} //
	
	public double getArea() {
		return (rad * rad) * PI;
	}

	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
		c.rad = -4.5; // 컴파일 오류 발생 안함. 하지만 사용하면 안됨. 변수안에 다이렉트로 접근하는 것은 안됨. 이건 함수를 거치지 않았기 때문.
		System.out.println(c.getArea()); 
	}
}

// 1. 클래스를 만들어 주면서 이후에 함수 설명서에 무조건 함수를 쓰도록 문서화 시킨다.
// 2. 앞에다 private 접근 제한자를 붙여 준다. private가 붙은 클래스 안에서만 사용이 가능하고 다른 클래스에서는 접근이 제한됨.
