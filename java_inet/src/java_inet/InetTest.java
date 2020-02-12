package java_inet;

import java.net.InetAddress;
import java.util.Scanner;

class InetAddressEx {
	
	Scanner scanner;
	
	public InetAddressEx() { // ������ ����
		System.out.println("Host �̸��� �Է� �ϼ���.");
		
		scanner = new Scanner(System.in);
		
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next()); // InetAddress.getLocalHost(); // �ڱ� �̸��� �ڱ� IP
			
			System.out.println("Computer NAME: " + inetAddress.getHostName());
			System.out.println("Computer IP: " + inetAddress.getHostAddress());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


public class InetTest {

	public static void main(String[] args) {
		new InetAddressEx(); // ������ �����ڸ� �̹� ����� ����.

	}

}
