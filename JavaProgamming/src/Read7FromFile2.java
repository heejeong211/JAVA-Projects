import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile2 {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("data.dat")) { // 이렇게 try() 괄호 안에 객체를 생성할 수 있다. 굳이 .close();안써줘도 됨.
			int dat = in.read();
			System.out.println(dat);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
