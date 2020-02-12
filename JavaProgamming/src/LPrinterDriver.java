
public class LPrinterDriver implements Printable {
	
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}
// 제조사가 코드 짬