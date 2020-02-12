
public class Circle {
	double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
	}
	
	// �� �Լ��� �߿���.
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
		c.rad = -4.5; // ������ ���� �߻� ����. ������ ����ϸ� �ȵ�. �����ȿ� ���̷�Ʈ�� �����ϴ� ���� �ȵ�. �̰� �Լ��� ��ġ�� �ʾұ� ����.
		System.out.println(c.getArea()); 
	}
}

// 1. Ŭ������ ����� �ָ鼭 ���Ŀ� �Լ� ������ ������ �Լ��� ������ ����ȭ ��Ų��.
// 2. �տ��� private ���� �����ڸ� �ٿ� �ش�. private�� ���� Ŭ���� �ȿ����� ����� �����ϰ� �ٸ� Ŭ���������� ������ ���ѵ�.
