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
			// �Ʒ� ���忡�� IOException �߻�
		writer = Files.newBufferedWriter(file);
		writer.write('A'); // IOException �߻�
		writer.write('Z'); // IOException �߻�
		
		if(writer != null)
			writer.close(); // IOException �߻�
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}

// ���� ����� ���Ͽ��ٰ� ���� �а� �� ���