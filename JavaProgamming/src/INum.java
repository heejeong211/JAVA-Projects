
class INum {
	private int num;
	public INum(int num) {
		this.num = num;
	}
	
	@Override //만약 오버라이딩 안해주면 결과가 둘다 내용 다르다가 나옴. equals는 주소값을 비교하는 메소드이기 때문
	public boolean equals(Object obj) {
		if (this.num == ((INum)obj).num)
			return true;
		else
			return false;
	}

}

class ObjectEquals {
	public static void main(String[] args) {
		INum num1 = new INum(10);
		INum num2 = new INum(20);
		INum num3 = new INum(10);
		
		if(num1.equals(num2))
			System.out.println("num1, num2 내용 동일하다.");
		else
			System.out.println("num1, num2 내용 다르다.");
		
		if(num1.equals(num3))
			System.out.println("num1, num3 내용 동일하다.");
		else
			System.out.println("num1, num3 내용 다르다.");
	}
}