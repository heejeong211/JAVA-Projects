
public class BankAccountPO {
	
	static int balance = 0; //���� �ܾ�    //�̷��� �Լ� �ۿ� ������ �����ص� ��. �̷��� ���� �����ϸ� ��� �Լ����� �� ������ ����� �� ����.
	
	public static void main(String[] args) {
		deposit(10000); //�Ա� ����
		checkMyBalance(); //�ܾ�Ȯ��
		withdraw(3000); //��� ����
		checkMyBalance(); //�ܾ�Ȯ��
	}
	
	public static int deposit(int amount) { //�Ա�
		balance += amount;
		return balance;
	}
	
	public static int withdraw(int amount) { //���
		balance -= amount;
		return balance;
	}
	
	public static int checkMyBalance() { //���� ��ȸ
		System.out.println("�ܾ�: " + balance);
		return balance;
	}
 
}
