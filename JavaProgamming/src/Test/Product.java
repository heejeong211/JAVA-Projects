package Test;

class Product {
	private int price;
	
	public Product(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}

}

class Computer extends Product {
	public Computer() {
		super(500);	
	}
	@Override
	public String toString() {
		return "��ǻ��";	
	}
}

class Moniter extends Product { 
	public Moniter() {
		super(200);
	}
	@Override
	public String toString() {
		return "�����";	
	}
}

class Keyboard extends Product { 
	public Keyboard() {
		super(100);
	}
	@Override
	public String toString() {
		return "Ű����";	
	}
}

class Mouse extends Product { 
	public Mouse() {
		super(50);
	}
	@Override
	public String toString() {
		return "���콺";	
	}
}