package Test;

class Buyer {
	private int money;
	private Product[] cart; // 장바구니의 크기가 한정적이니까 배열을 사용해야 한다.
	int num = 0; // add() 때문에 선언함.
	
	public Buyer(int money, Product[] cart) {
		this.money = money;
		this.cart = cart;
	}
	
	// 지정된 물건을 구입한다. 가진 돈(money)에서 물건의 가격을 빼고, 장바구니(cart)에 담는다.
	void buy(Product p) {
		if(money >= p.getPrice()) {
			money -= p.getPrice();
			add(p);
		} else {
			System.out.println("가진 돈이 부족합니다.");
		}
		
	}
	
	// 지정된 물건을 장바구니에 담는다. 만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음에 담는다.
	void add(Product p) {
		if(cart.length == num) { // 장바구니가 꽉 차면
			Product[] temp = new Product[cart.length * 2]; // 새로운 장바구니 객체 생성
			for (int i = 0; i < cart.length; i++) { // System.arraycopy(cart,0,temp,0,cart.length);
				temp[i] = cart[i]; // swap해줘야 함.   // x
			}
			cart = temp;
		}
		cart[num++] = p; // 장바구니 안늘리면 이것만 사용하면 됨.
	}
	
	// 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
	void summary() {
		
		/*String itemList = "";
		 *  int sum = 0;
		 * 
		 *  for(int i = 0; i < cart.length; i++) {
		 *    if(cart[i] == null)
		 *        break;
		 * 
		 * itemList += cart[i].toString() + ","; // 굳이 toString() 안적어줘도 됨. cart[i]가 문자열이라 자동적으로 toString() 붙여줌.
		 * sum += cart[i].price;
		 * 
		 *System.out.println("구입한 물건은 :" + itemList);
		 *System.out.println("사용한 금액 :" + sum);
	     *System.out.println("남은 금액 :" + money);
		 */
		
		int sum = 0;
		System.out.print("구입한 물건은: ");
		for (int i = 0; i < num; i++) {
			System.out.print(cart[i].toString() + " ");
		}
		System.out.println();
		
		System.out.print("현재 사용 금액은: ");
		for (int i = 0; i < num; i++) {
			sum += cart[i].getPrice();
		}
		System.out.println(sum);
		
		System.out.print("남은 금액은: " + money);
	}
}

public class BuyerTest {

	public static void main(String[] args) {
		Product[] cart = new Product[3]; // 장바구니 배열의 크기 3
		
		Buyer b = new Buyer(30000, cart);
		b.buy(new Moniter());
		b.buy(new Computer());
		b.summary();
	}

}
