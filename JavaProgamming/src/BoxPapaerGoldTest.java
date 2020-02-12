
public class BoxPapaerGoldTest {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

	}
	
	public static void wrapBox(Box box) { // Box box = box2 부모 = 자식 -> 다형성
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap();
		}
		else if (box instanceof PaperBox) { // box2는 형변환 가능함. Box나 PaperBox로.
			((PaperBox)box).paperWrap();
		}
		else {
			box.simpleWrap();
		}
	}

}
