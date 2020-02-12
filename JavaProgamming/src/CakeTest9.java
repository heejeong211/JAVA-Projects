
class Cake9 {
	public String toString() { // Object 클래스의 toString 메소드를 오버라이딩 한 것임.
		return "My birthday cake"; // 자식꺼라서 이게 출력되는 것이다. 부모꺼는 이상한 주소 같은 거 나옴.
	}
}



public class CakeTest9 {
	
	public static void main(String[] args) {
		
		Cake9 c = new Cake9();
		System.out.println(c);
		
	}

}
