
public class TestClass {
	
	void instanceMethod () {} // 인스턴스 메소드
	static void staticMethod () {} // static 메소드
	
	void instanceMethod2 () { // 인스턴스 메소드
		instanceMethod(); // 다른 인스턴스 메소드를 호출한다.
		staticMethod(); // static 메소드를 호출한다.
	}
	
	static void sataicMethod2 () { //static메소드
		instanceMethod(); //에러!! 인스턴스메서드를 호출할 수 없다.
		staticMethod();
	}

}

//static 함수 안에 인스턴스멤버(변수, 함수)가 올 수 없는 이유는?
//static 함수 안에서 인스턴스 라면이 올 수 없는 이유는?
//인스턴스 함수 안에는 인스턴스든 static이든 다 올 수 있음. 그러나 static 함수 안에는 static 붙은 애들만 와야함.
//인스턴스는 new 했을 때(객체생성)만 호출할 수 있음.
//메모리 올라가는 시간이 다른기 때문. static은 클래스를 읽어들일 때 메모리에 올라가고 인스턴스는 new를 읽어들일 때 메모리에 올라간다.
