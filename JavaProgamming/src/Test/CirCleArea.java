package Test;
// ����, PI, area;
public class CirCleArea {

	double radius;
	
	CirCleArea(double radius) {
		if(radius < 0) { //����ó��
			System.out.println("������ �ȵ˴ϴ�.");
			//return;
		} else {
		this.radius = radius; // this�� �ڱ� �ڽ��� ���ϴ� ��.
		}
	}
	
	double getArea() {
		return radius * radius * Math.PI; //Math.PI�� Ŭ����.������ (static�̶� ����)
	}

}
