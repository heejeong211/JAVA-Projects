package Test;


public class TestArea {

	public static void main(String[] args) {
		
		IArea a = new Rectangle(3.5, 4.5);
		System.out.println("�簢���� ����: " + a.area());
		System.out.println();
		
		a = new Triangle(1.2, 7.5);
		System.out.println("�ﰢ���� ����: " + a.area());
		

	}

}
