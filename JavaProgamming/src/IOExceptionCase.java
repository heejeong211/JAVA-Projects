import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase {

	public static void main(String[] args) {
		Path file = Paths.get(":C\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			// 아래 문장에서 IOException 발생
		writer = Files.newBufferedWriter(file);
		writer.write('A'); // IOException 발생
		writer.write('Z'); // IOException 발생
		
		if(writer != null)
			writer.close(); // IOException 발생
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}

// 내가 만드는 파일에다가 글을 읽고 쓴 방법