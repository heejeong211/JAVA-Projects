package Test;

class Garray<T> {
	private T[] arr; //String[] -> T[]
	
	public void setArr(T[] arr) {
		this.arr = arr;
	}
	
	public void printArr() {
		for(T str : arr) {
			System.out.println(str);
		}
	}
	
	
}

public class GenericTest {

	public static void main(String[] args) {
		Garray<String> gt = new Garray<String>();

		String[] ss = { "�ٳ���", "����", "����", "������", "�ƾ�" };
		gt.setArr(ss);
		gt.printArr();

	}

}
