
class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

// 다음 상자는 사과도 오렌지도 담을 수 있다.
class Box3 { // 무엇이든 저장하고 꺼낼 수 있는 상자.
	private Object ob; // Object를 사용한 이유는 사과든 오렌지든 다형성 적용하기 위해서.
	
	public void set(Object o) {
		ob = o;
	}
	
	public Object get() {
		return ob;
	}
}


public class AppleOrangeTest {

	public static void main(String[] args) {
		Box3 aBox = new Box3(); // 상자생성.
		Box3 oBox = new Box3(); // 상자생성.
		
		aBox.set(new Apple()); // 상자에 사과를 담는다.          //aBox.set("Apple"); 클래스 Apple을 넣어야 하는데 문자열 Apple을 넣음. 하지만 문법적으로는 잘못한게 없어 컴파일 오류가 나질 않음.
		oBox.set(new Orange()); // 상자에 오렌지를 담는다.       //oBox.set("Orange");
		
		Apple ap = (Apple)aBox.get(); // 상자에 사과를 꺼낸다.        //System.out.println(aBox.get()); 지금 set에 Apple 문자열이 들어가서 저장되었기 때문에 결과가 Apple이 나옴. 이건 컴파일 오류도 안나고 런타임에러도 안남.
		Orange op = (Orange)oBox.get(); // 상자에 오렌지를 꺼낸다.    //System.out.println(oBox.get());
		
		System.out.println(ap);
		System.out.println(op);
	}

}

// 어쩔 수 없이 형 변환의 과정이 수반된다.
// 그리고 이는 컴파일러의 오류 발견 가능성을 낮추는 결과로 이어진다.