
public class CakeCheeseTest {

	public static void main(String[] args) {
		
		Cake c1 = new CheeseCake(); // ������ ������.
		CheeseCake c2 = new CheeseCake(); // ������ ���� �ȵ�.
		
		c1.yummy(); // ���: Yummy Cheese Cake / super�ٿ��� ��: Yummy Cake, Yummy Cheese Cake
		c2.yummy(); // ���: Yummy Cheese Cake / super�ٿ��� ��: Yummy Cake, Yummy Cheese Cake
		c2.tasty(); // super�ٿ��� ��: Yummy Cake, Yummy Taste Cake

	}

}
