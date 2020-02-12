package Test;

public class ColorTV extends TV {

	private int color;
	
	public ColorTV(int size, int color) {
		super(size); // 부모에 있는 생성자 호출.
		this.color = color;
	}
	
	int getColor() {
		return color;
	}
	
	public void printProperty() {
		System.out.println(super.getSize() + " 인치 " + color + " 컬러"); // super.size 가져오려 했는데 에러남. 왜? private이라 size 가져오려면  getSize() 밖에 없음.
	}
	
}
