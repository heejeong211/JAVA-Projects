package Test;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle[] circle = new Circle[3];
		
		for(int i = 0; i < circle.length; i++) {
			System.out.print("x, y, radius >> ");
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			
			circle[i] = new Circle(x, y, radius); //객체 생성. for문이 3번 돌으니까 객체도 3개 생성.
		}
		
		for(Circle c : circle) {
			c.show();
		}
	}

}
