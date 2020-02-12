
public class MobileSmartPhone {

	public static void main(String[] args) {
		
		MobilePhone phone = new SmartPhone("010-555-777", "Nougat"); // 이것이 바로 다형성
		
		phone.answer(); // 전화를 받는다.
		((SmartPhone)phone).playApp(); // 앱을 선택하고 실행한다.

	}

}
