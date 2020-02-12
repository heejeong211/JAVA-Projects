
public class UnivFriend extends Friend {
	
	private String major;
	
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
	}
	
	public void showInfo() {
		super.showInfo(); // 오버라이딩 -> 자식꺼
		System.out.println("전공: " + major);
	}

}
