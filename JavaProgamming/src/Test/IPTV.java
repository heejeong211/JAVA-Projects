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
		System.out.println("나의 IPTV는 " + address + " 주소의 " + super.getSize() + "인치 " + super.getColor() + "컬러");
	//	super.printProperty(); // (super.getSize() + " 인치 " + color + " 컬러")
	}

}
