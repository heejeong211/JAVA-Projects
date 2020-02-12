
public class PrinterTest {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		Printable prn = new SPrinterDriver(); // 다형성 적용.
		prn.print(myDoc); // 오버라이딩
		System.out.println();
		
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
// 일밤 프로그램어가 코드 짬.
// 인터페이스 + 다형성 + 오버라이딩
