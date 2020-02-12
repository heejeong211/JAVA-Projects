import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.omg.CORBA.portable.InputStream;

public class KiloBytesFileCopier {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("대상 파일: ");
		String src = sc.nextLine();
		System.out.print("사본 파일: ");
		String dst = sc.nextLine();
		
		try(FileInputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)) {
			byte buf[] = new byte[1024];
			int len;
			
			while(true) {
				len = in.read(buf); // 배열 buf로 데이터를 읽어 들이고, (더 이상 읽어 들일 데이터 없으면 -1 반환)
				if(len == -1) {
					break;
				}
				out.write(buf, 0, len); // len 바이트만큼 데이터를 저장한다.
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}

// 1 킬로바이트 버퍼 기반 파일 복사 프로그램
