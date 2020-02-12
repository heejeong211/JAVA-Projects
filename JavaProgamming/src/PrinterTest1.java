
public class PrinterTest1 {

	public static void main(String[] args) {
		Printable3 prn1 = new SimplePrinter();
		Printable3 prn2 = new MultiPrinter();
		
		if(prn1 instanceof Printable3)
			prn1.printLine("This is a simple printer.");
		System.out.println();
		
		if(prn2 instanceof Printable3)
			prn2.printLine("This is a multiful printer.");
	}

}
