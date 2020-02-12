package Test;

import java.util.HashMap;
import java.util.Scanner;

public class CountryPopulationTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("나라 이름, 인구>>");
			String country = sc.next();
			
			if(country.equals("그만")) {
				break;
			}
			
			int population = sc.nextInt();
			map.put(country, population);
		}
		
		while(true) {
			System.out.print("인구 검색>>");
			String country = sc.next();
			
			if(country.equals("그만")) {
				break;
			}
			
			Integer m = map.get(country);
			
			if(m == null) {
				System.out.println(country + "나라는 없습니다.");
			} else {
				System.out.println(country + "의 인구는 " + m);
			}
		}
		System.out.println("프로그램 종료 입니다.");
		sc.close();

	}

}
		
		/*
		String c;
		int p;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
		
		
		if(true) {
			System.out.print("나라 이름, 인구>>");
			map.put(sc.next(), sc.nextInt());
		} else if(sc.next().equals("그만")) {
			System.out.print("인구 검색 >>" + map.get(sc.next()));
		}
			
			
		
		
		while(true) {
			if (true) {
			System.out.print("나라 이름, 인구>>");
			c = sc.next();
			p = sc.nextInt();
			map.put(c, p);
			} else if(c.equals("그만")) {
				
			}
			break;
		} if(true) {
			System.out.print("인구 검색 >>" + map.get(c));
			System.out.println(c + "의 인구는 " + p);
		}
		*/
