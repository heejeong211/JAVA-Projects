
class Board { }

class PBoard extends Board { }

class ClassCast {
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1; // OK!
		
		System.out.println("... intermediate lovation ...");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1; // Exception! �����Ͽ��� �� ��� ����.
	}
}

// ���������̱� ������ �����Ͽ��� �� ����. -> new�� �����ϰ� ���� Ȯ���ؾ� �ϱ� ������ �̸� �ؽ�Ʈ�θ� �Ǵ� ����.