
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
		
		Person jung = new Person(335577, 112233); // 여권 있는 사람의 정보를 담은 인스턴스 생성
		Person hong = new Person(77544); // 여권 없는 사람의 정보를 담은 인스턴스 생성
		
		jung.showPersenalInfo();
		hong.showPersenalInfo();
	}
}
