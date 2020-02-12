
public class CakeCheeseTest {

	public static void main(String[] args) {
		
		Cake c1 = new CheeseCake(); // 다형성 구현됨.
		CheeseCake c2 = new CheeseCake(); // 다형성 구현 안됨.
		
		c1.yummy(); // 결과: Yummy Cheese Cake / super붙였을 때: Yummy Cake, Yummy Cheese Cake
		c2.yummy(); // 결과: Yummy Cheese Cake / super붙였을 때: Yummy Cake, Yummy Cheese Cake
		c2.tasty(); // super붙였을 때: Yummy Cake, Yummy Taste Cake

	}

}
