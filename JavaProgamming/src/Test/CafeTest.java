package Test;

import java.util.HashMap;
import java.util.Scanner;

public class CafeTest {

	public static void main(String[] args) {
		HashMap<String, Integer> menu = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī��󶼰� �ֽ��ϴ�.");
		System.out.println("� �ɷ� �ֹ��Ͻðڽ��ϱ�?");
		
		menu.put("����������", 2000);
		menu.put("�Ƹ޸�ī��", 2500);
		menu.put("īǪġ��", 3000);
		menu.put("ī���", 3500);
		
		while(true) {
			System.out.print("�ֹ� >>");
			String coffee = sc.next();
			/*
			if(coffee.equals("����������")) {
				System.out.println(coffee + "�� "+ menu.get(coffee) +"�� �Դϴ�.");
			} else if (coffee.equals("�Ƹ޸�ī��")) {
				System.out.println(coffee + "�� "+ menu.get(coffee) +"�� �Դϴ�.");
			}else if (coffee.equals("īǪġ��")) {
				System.out.println(coffee + "�� "+ menu.get(coffee) +"�� �Դϴ�.");
			}else if (coffee.equals("ī���")) {
				System.out.println(coffee + "�� "+ menu.get(coffee) +"�� �Դϴ�.");
			} */
				if(coffee.equals("�׸�")) {
				break;
			}
				System.out.println(coffee + "�� "+ menu.get(coffee) +"�� �Դϴ�.");
			
		}
		System.out.println("�ֹ��Ϸ�Ǿ����ϴ�. �����մϴ�. �����Ϸ� �Ǽ��� *^.^*");
		sc.close();

	}

}
