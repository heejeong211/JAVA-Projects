package Test;

import java.util.HashMap;
import java.util.Scanner;

public class CafeTest {

	public static void main(String[] args) {
		HashMap<String, Integer> menu = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼가 있습니다.");
		System.out.println("어떤 걸로 주문하시겠습니까?");
		
		menu.put("에스프레소", 2000);
		menu.put("아메리카노", 2500);
		menu.put("카푸치노", 3000);
		menu.put("카페라떼", 3500);
		
		while(true) {
			System.out.print("주문 >>");
			String coffee = sc.next();
			/*
			if(coffee.equals("에스프레소")) {
				System.out.println(coffee + "는 "+ menu.get(coffee) +"원 입니다.");
			} else if (coffee.equals("아메리카노")) {
				System.out.println(coffee + "는 "+ menu.get(coffee) +"원 입니다.");
			}else if (coffee.equals("카푸치노")) {
				System.out.println(coffee + "는 "+ menu.get(coffee) +"원 입니다.");
			}else if (coffee.equals("카페라떼")) {
				System.out.println(coffee + "는 "+ menu.get(coffee) +"원 입니다.");
			} */
				if(coffee.equals("그만")) {
				break;
			}
				System.out.println(coffee + "는 "+ menu.get(coffee) +"원 입니다.");
			
		}
		System.out.println("주문완료되었습니다. 감사합니다. 좋은하루 되세요 *^.^*");
		sc.close();

	}

}
