import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile2 {

	public static void main(String[] args) {
		try(OutputStream out = new FileOutputStream("data.dat");) { // �̷��� try() ��ȣ �ȿ� ��ü�� ������ �� �ִ�. ���� .close();�Ƚ��൵ ��.
			out.write(7);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
