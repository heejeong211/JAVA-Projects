
public class Method1 {
	
	public static void main(String[] args) {
		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(12, myHeight);
		byEveryone();
	}
	
	public static void hiEveryone(int age, double height) { //�Ű� ������ ���� �޼ҵ��� ����
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("���� Ű�� " +  height + "cm �Դϴ�.");
	}
	
	public static void byEveryone() { //�Ű� ������ ���� �޼ҵ��� ����
		System.out.println("������ �˰ڽ��ϴ�.");
	}

}
