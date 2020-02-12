package Test;

public class IPTV extends ColorTV{
	
	private String address;
	
	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}
	
	String getAddress() {
		return address;
	}
	
	public void printProperty() {
		System.out.println("���� IPTV�� " + address + " �ּ��� " + super.getSize() + "��ġ " + super.getColor() + "�÷�");
	//	super.printProperty(); // (super.getSize() + " ��ġ " + color + " �÷�")
	}

}
