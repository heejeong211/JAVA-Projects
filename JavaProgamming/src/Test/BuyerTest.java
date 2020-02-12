package Test;

class Buyer {
	private int money;
	private Product[] cart; // ��ٱ����� ũ�Ⱑ �������̴ϱ� �迭�� ����ؾ� �Ѵ�.
	int num = 0; // add() ������ ������.
	
	public Buyer(int money, Product[] cart) {
		this.money = money;
		this.cart = cart;
	}
	
	// ������ ������ �����Ѵ�. ���� ��(money)���� ������ ������ ����, ��ٱ���(cart)�� ��´�.
	void buy(Product p) {
		if(money >= p.getPrice()) {
			money -= p.getPrice();
			add(p);
		} else {
			System.out.println("���� ���� �����մϴ�.");
		}
		
	}
	
	// ������ ������ ��ٱ��Ͽ� ��´�. ���� ��ٱ��Ͽ� ���� ������ ������, ��ٱ����� ũ�⸦ 2��� �ø� ������ ��´�.
	void add(Product p) {
		if(cart.length == num) { // ��ٱ��ϰ� �� ����
			Product[] temp = new Product[cart.length * 2]; // ���ο� ��ٱ��� ��ü ����
			for (int i = 0; i < cart.length; i++) { // System.arraycopy(cart,0,temp,0,cart.length);
				temp[i] = cart[i]; // swap����� ��.   // x
			}
			cart = temp;
		}
		cart[num++] = p; // ��ٱ��� �ȴø��� �̰͸� ����ϸ� ��.
	}
	
	// ������ ������ ��ϰ� ���ݾ�, ���� �ݾ��� ����Ѵ�.
	void summary() {
		
		/*String itemList = "";
		 *  int sum = 0;
		 * 
		 *  for(int i = 0; i < cart.length; i++) {
		 *    if(cart[i] == null)
		 *        break;
		 * 
		 * itemList += cart[i].toString() + ","; // ���� toString() �������൵ ��. cart[i]�� ���ڿ��̶� �ڵ������� toString() �ٿ���.
		 * sum += cart[i].price;
		 * 
		 *System.out.println("������ ������ :" + itemList);
		 *System.out.println("����� �ݾ� :" + sum);
	     *System.out.println("���� �ݾ� :" + money);
		 */
		
		int sum = 0;
		System.out.print("������ ������: ");
		for (int i = 0; i < num; i++) {
			System.out.print(cart[i].toString() + " ");
		}
		System.out.println();
		
		System.out.print("���� ��� �ݾ���: ");
		for (int i = 0; i < num; i++) {
			sum += cart[i].getPrice();
		}
		System.out.println(sum);
		
		System.out.print("���� �ݾ���: " + money);
	}
}

public class BuyerTest {

	public static void main(String[] args) {
		Product[] cart = new Product[3]; // ��ٱ��� �迭�� ũ�� 3
		
		Buyer b = new Buyer(30000, cart);
		b.buy(new Moniter());
		b.buy(new Computer());
		b.summary();
	}

}
