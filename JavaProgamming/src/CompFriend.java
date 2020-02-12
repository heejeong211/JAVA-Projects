
public class CompFriend extends Friend {
	
	private String department;
	
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
	
	public void showInfo() {
		super.showInfo(); // 오버라이딩 -> 자식꺼
		System.out.println("부서: " + department);
	}

}
