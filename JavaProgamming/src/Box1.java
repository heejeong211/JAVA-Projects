
public class Box1 {
	
	private String conts;
	
	Box1(String cont) {this.conts = cont;}
	public String toString() {
		return conts;
	}

}

class BoxTest1 {
	public static void main(String[] args) {
		
		Box1[] ar = new Box1[3];
		
		// �迭�� �ν��Ͻ� ����.
		ar[0] = new Box1("First");
		ar[1] = new Box1("Second");
		ar[2] = new Box1("Third");
		
		// ����� �ν��Ͻ��� ����.
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}

// �ϴ� ���� 3�� ��µ�, ��ü�̴ϱ� ��ü�� �ּҸ� ������ ����. 
//�ٵ� sysout(ar[0])�� �� First�� ���ñ�?
//println���� �ش� ��ü�� ���� �ȿ� toString() ȣ���ؼ� String�� ��������� ����.