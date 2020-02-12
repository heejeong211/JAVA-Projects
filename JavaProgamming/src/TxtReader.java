import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.Reader;

public class TxtReader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����: ");
		String src = sc.nextLine();
		
		try(Reader in = new FileReader(src)) { // ���� �Է� ��Ʈ�� ����
			int ch;
			
			while(true) {
				ch = in.read(); // ���ڸ� �ϳ��� �д´�.
				if(ch == -1) { // �� �̻� ���� ���ڰ� ���ٸ�,
					break;
				}
				System.out.println((char)ch); // ���ڸ� �ϳ��� ����Ѵ�.(ln���� �������� ���)
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
