
public class Prn909Drv implements ColorPrintable {
	

	@Override
	public void print(String doc) { // ��� ���
		System.out.println("black & white ver");
		System.out.println(doc);
		
	}

	@Override
	public void printCMYK(String doc) { // �÷� ���
		System.out.println("CMYK ver");
		System.out.println(doc);
		
	}
	
	

}
