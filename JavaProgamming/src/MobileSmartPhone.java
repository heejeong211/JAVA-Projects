
public class MobileSmartPhone {

	public static void main(String[] args) {
		
		MobilePhone phone = new SmartPhone("010-555-777", "Nougat"); // �̰��� �ٷ� ������
		
		phone.answer(); // ��ȭ�� �޴´�.
		((SmartPhone)phone).playApp(); // ���� �����ϰ� �����Ѵ�.

	}

}
