package Test;

public class Test2 {
	
	public static void main(String[] args) {
		//1���� 100������ ��
		//1+2+3+4+5+...+100
		
		int total = 0;
		
		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}
		System.out.println(total);
		
		//1���� 100���� ���� �߿� 3�� ���
		 for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0) {
				System.out.println("3�� ����� " + i + "�Դϴ�.");
			}
		}
		 total = 0;//������ total�� ��� ������ �� �ʱ�ȭ �� �����.
		 
		 for (int i = 1; i <= 100; i++) {
			 
			 if(i % 2 == 1 ) { //Ȧ�� ����
				 total = total + i;
			 }	 
		}
		 System.out.println(total);
		 
		 int dan = 7;
		 
		 for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}

}

/*
int n = 1;

while (n <= 100) {
	System.out.println();
}
for (n = 1; n <= 100; n++) {
	if(n%3 == 0) {
		System.out.println(n);
	}
} */