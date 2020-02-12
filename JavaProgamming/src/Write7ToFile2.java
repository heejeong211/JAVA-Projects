import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile2 {

	public static void main(String[] args) {
		try(OutputStream out = new FileOutputStream("data.dat");) { // 이렇게 try() 괄호 안에 객체를 생성할 수 있다. 굳이 .close();안써줘도 됨.
			out.write(7);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
