
public class Box1 {
	
	private String conts;
	
	Box1(String cont) {this.conts = cont;}
	public String toString() {
		return conts;
	}

}

class BoxTest1 {
	public static void main(String[] args) {
		
		Box1[] ar = new Box1[3];
		
		// 배열에 인스턴스 저장.
		ar[0] = new Box1("First");
		ar[1] = new Box1("Second");
		ar[2] = new Box1("Third");
		
		// 저장된 인스턴스의 참조.
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}

// 일단 바을 3개 잡는데, 객체이니까 객체의 주소를 가지고 있음. 
//근데 sysout(ar[0])이 왜 First가 나올까?
//println에서 해당 객체가 들어가면 안에 toString() 호출해서 String이 결과값으로 나옴.