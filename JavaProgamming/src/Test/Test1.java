package Test;

public class Test1 {
	
	public static void main(String[] args) {
		/*
		 * 1. �ƹ��� ������ ���α׷��� ���踦 �Ѵ�. ����(�䱸���׺м�) -> �ڵ� -> �׽�Ʈ -> ����
		 * 2. �䱸���� �γ��� �Ѵ�. (��հ��� ��쿡�� �������� ����.)
		 * 3. ������ �����Ͽ� ����.
		 * */
	
		int kor = 60;
		int math = 70;
		int eng = 100;
		
		int total;
		double avg;
		char grade;
		
		total = kor + math + eng;
		avg = total / (double)3; //total�� int�� 3�� int�̱� ������ 3.0���� �ϴ��� �ƴϸ� double�� ����� ����ȯ �ؾ� ��.
		
		if (avg >= 90) {
			grade = '��';
		} else if (avg >= 80) {
			grade = '��';
		} else if (avg >= 70) { 
			grade = '��';
		} else if (avg >= 60) {
			grade = '��';
		} else {
			grade = '��';
		}
		
		System.out.println("����� ������: " + total);
		System.out.println("����� �����: " + avg);
		System.out.println("����� ������: " + grade);
		
		
		/*
		int korean = 60;
		int math = 70;
		int english = 100;
		
		System.out.println("����: " + (korean + math + english));
		System.out.println("���: " + ((korean + math + english)/3));
		
		if (((korean + math + english)/3) >= 90) {
			System.out.println("��");
		}else if (((korean + math + english)/3) >= 80) {
			System.out.println("��");
		}else if (((korean + math + english)/3) >= 70) {
			System.out.println("��");
		}else if (((korean + math + english)/3) >= 60) {
		    System.out.println("��");
		}else {
			System.out.println("��");
		} */
	}

}
