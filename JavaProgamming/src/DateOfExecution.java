import java.time.LocalDate;

public class DateOfExecution {
	
	static String date;
	
	static { // �ν��Ͻ� ������ ���� ���� static ������ �޸� ������ �Ҵ�� �� ������ �ȴ�.
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(date);
	}

}
