package java_inet;

import java.net.InetAddress;
import java.util.Scanner;

class InetAddressEx {
	
	Scanner scanner;
	
	public InetAddressEx() { // 생성장 만듦
		System.out.println("Host 이름을 입력 하세요.");
		
		scanner = new Scanner(System.in);
		
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next()); // InetAddress.getLocalHost(); // 자기 이름과 자기 IP
			
			System.out.println("Computer NAME: " + inetAddress.getHostName());
			System.out.println("Computer IP: " + inetAddress.getHostAddress());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


public class InetTest {

	public static void main(String[] args) {
		new InetAddressEx(); // 위에서 생성자를 이미 만들어 줬음.

	}

}
