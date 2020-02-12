package Test;

import java.util.HashMap;
import java.util.Scanner;

public class CountryPopulationTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (��: Korea 5000)");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �̸�, �α�>>");
			String country = sc.next();
			
			if(country.equals("�׸�")) {
				break;
			}
			
			int population = sc.nextInt();
			map.put(country, population);
		}
		
		while(true) {
			System.out.print("�α� �˻�>>");
			String country = sc.next();
			
			if(country.equals("�׸�")) {
				break;
			}
			
			Integer m = map.get(country);
			
			if(m == null) {
				System.out.println(country + "����� �����ϴ�.");
			} else {
				System.out.println(country + "�� �α��� " + m);
			}
		}
		System.out.println("���α׷� ���� �Դϴ�.");
		sc.close();

	}

}
		
		/*
		String c;
		int p;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (��: Korea 5000)");
		
		
		if(true) {
			System.out.print("���� �̸�, �α�>>");
			map.put(sc.next(), sc.nextInt());
		} else if(sc.next().equals("�׸�")) {
			System.out.print("�α� �˻� >>" + map.get(sc.next()));
		}
			
			
		
		
		while(true) {
			if (true) {
			System.out.print("���� �̸�, �α�>>");
			c = sc.next();
			p = sc.nextInt();
			map.put(c, p);
			} else if(c.equals("�׸�")) {
				
			}
			break;
		} if(true) {
			System.out.print("�α� �˻� >>" + map.get(c));
			System.out.println(c + "�� �α��� " + p);
		}
		*/
