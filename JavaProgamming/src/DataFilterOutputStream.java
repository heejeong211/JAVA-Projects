import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFilterOutputStream {

	public static void main(String[] args) {
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"))) {
			out.write(370); // int�� ������ ����
			out.writeDouble(3.14); // double�� ������ ����
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
