
public class Person {
	
	private int regiNum;
	private int passNum;
	
	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}
	
	Person(int rnum) {
		regiNum = rnum;
		passNum = 0;
	}
	
	void showPersenalInfo() {
		int regiNum;
		int passNum;
	}

}

class PersonTest {
	public static void main(String[] args) {
		
		Person jung = new Person(335577, 112233); // ���� �ִ� ����� ������ ���� �ν��Ͻ� ����
		Person hong = new Person(77544); // ���� ���� ����� ������ ���� �ν��Ͻ� ����
		
		jung.showPersenalInfo();
		hong.showPersenalInfo();
	}
}
