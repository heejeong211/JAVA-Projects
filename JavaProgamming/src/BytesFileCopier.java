import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class BytesFileCopier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일: ");
		String src = sc.nextLine();
		System.out.print("사본 파일: ");
		String dst = sc.nextLine();
		
		try(FileInputStream in = new FileInputStream(src); 
				OutputStream out = new FileOutputStream(dst)) {
			int data;
			while(true) {
				data = in.read(); // 파일로부터 1 바이트를 읽는다.
				if(data == -1) { // 더 이상 읽어 들일 데이터가 없다면,
					break;
				}
				out.write(data); // 파일에 1 바이트를 쓴다.
				
			}
				}
				catch(IOException e) {
					e.printStackTrace();
				}

	}

}

// 바이트 단위 파일 복사하는 프로그램
// 출력결과
// 대상 파일: .project
// 사본 파일: copy.dat
