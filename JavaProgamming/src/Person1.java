
class Person1 {
	String name;
	public Person1(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize(); // 상위 클래스의 finalize 메소드 호출
		System.out.println("destroyed: " + name); // 밑에서 null를 만들었는데도 불구하고 이게 실행이 안될까? 
	}

}

class Person1Test {
	public static void main(String[] args) {
		
	Person1 p1 = new Person1("Yoon");
	Person1 p2 = new Person1("Park");
	p1 = null; // 참조대상을 가비지 컬렉션의 대상으로 만듦. 인스턴스 소멸시킬려면 이 방법밖에 없음.
	p2 = null; // 참조대상을 가비지 컬렉션의 대상으로 만듦.
	//System.gc(); //함부로 사용해선 안됨.
	//System.runFinalization();
	
	System.out.println("end of program");
	
	}
}
