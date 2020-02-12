
class Box4<T> { // 제네릭타입  Object를 T로 바꿈.
	private T ob; 
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class AppleOrangeTest1 {

	public static void main(String[] args) {
		Box4<Apple> aBox = new Box4<Apple>(); // 상자생성.
		Box4<Orange> oBox = new Box4<Orange>(); // 상자생성.
		
		aBox.set(new Apple()); // 상자에 사과를 담는다.          //aBox.set("Apple"); 이제는 컴파일 오류남.
		oBox.set(new Orange()); // 상자에 오렌지를 담는다.       //oBox.set("Orange");
		
		Apple ap = aBox.get(); // 상자에 사과를 꺼낸다.      // 형변환 시켜 줄 필요가 없음. 이미 Apple로 타입이 바뀌었기 때문에.  
		Orange op = oBox.get(); // 상자에 오렌지를 꺼낸다.    
		
		System.out.println(ap);
		System.out.println(op);

	}

}
