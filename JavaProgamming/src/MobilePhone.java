
public class MobilePhone {
	
	protected String number; // 전화번호
	
	public MobilePhone(String num) {
		number = num;
	}
	
	public void answer() {
		System.out.println("Hi~ from " + number);
	}

}
