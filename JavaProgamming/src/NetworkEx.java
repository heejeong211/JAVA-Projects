import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx {

	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "http://www.naver.com"; // http���� ������, naver�� �Ѱ��� ��ǻ����(IP�ּҴϱ�)
		String line = "";
		
		try {
			url = new URL(address); // url��ü�� ����
			
			// ������������ html �ؽ�Ʈ�� �޾� �� ����. (�̹��� ����...)
			input = new BufferedReader(new InputStreamReader(url.openStream())); // url.openStream()�� �ϸ� Stream�̴ϱ� ������� �ϱ� ���ؼ� naver�� �� ���̿� ���ἱ�� ����.
			
			while((line=input.readLine()) != null) { // ���� ���� �о� ����.
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
// ���� �������� ���α׷�(�������� ����)
// �׸�(�̹���)�� ���������� �׸���, ���������� html�� �ش��ϴ� �ؽ�Ʈ�� ������.
