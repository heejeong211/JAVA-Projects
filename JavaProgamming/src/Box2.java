
class Box2 {
	private String conts;
	
	Box2(String cont) {
		this.conts = cont;
	}
	
	public String toString() {
		return conts;
	}

}

class BoxTest {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);
		
		Box2 box = new Box2("Camera");
		System.out.println(box.toString());
		System.out.println(box);
	}
}
