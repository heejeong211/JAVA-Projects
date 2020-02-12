package Test;

import java.util.Scanner;
import java.util.Vector;

public class PrecipitationTest {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>(); // LinkedList<>, ArrayList<>로 해도 됨.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >>");
			int rain = sc.nextInt();
			
			if(rain == 0) {
				break;
			}
			vec.add(rain);
			
			int avg = 0;
			
			for(int i = 0; i < vec.size(); i++) {
				System.out.print(vec.get(i) + " ");
				avg = avg + vec.get(i); // 안에 있는 값을 더하는 중
			}
			
			System.out.println();
			avg = avg/vec.size();
			
			System.out.println("현재 평균" + avg);
		}
		System.out.println("프로그램 종료입니다.");
		sc.close();
	}
}
		
		/*
		
		Vector<Integer> vec = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("강수량 입력 (0 입력시 종료) >> ");
			int rain = sc.nextInt();
			for(int i = 0; i < vec.size(); i++) {
				System.out.println(vec.elementAt(i));
			}
			int sum = 0;
			int avg = sum/rain;
			System.out.println("현재 평균 " + avg);
			
			if(rain == 0) {
				break;
			}
		}

	}

}
*/