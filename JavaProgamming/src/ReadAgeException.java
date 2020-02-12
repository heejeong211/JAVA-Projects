
public class ReadAgeException extends Exception { // Exception을 상속하는 것이 핵심!!
	
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}// Throwable 클래스의 getMessage 메소드(반환은 detailMessage임)가 반환할 문자열 지정

}

// Exception 클래스를 상속하는 것이 예외 클래스의 유일한 조건