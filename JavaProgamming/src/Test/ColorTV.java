package Test;

public class ColorTV extends TV {

	private int color;
	
	public ColorTV(int size, int color) {
		super(size); // �θ� �ִ� ������ ȣ��.
		this.color = color;
	}
	
	int getColor() {
		return color;
	}
	
	public void printProperty() {
		System.out.println(super.getSize() + " ��ġ " + color + " �÷�"); // super.size �������� �ߴµ� ������. ��? private�̶� size ����������  getSize() �ۿ� ����.
	}
	
}
