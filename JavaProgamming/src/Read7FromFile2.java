import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile2 {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("data.dat")) { // �̷��� try() ��ȣ �ȿ� ��ü�� ������ �� �ִ�. ���� .close();�Ƚ��൵ ��.
			int dat = in.read();
			System.out.println(dat);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
