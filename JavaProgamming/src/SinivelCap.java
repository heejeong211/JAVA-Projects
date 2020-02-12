
class SinivelCap {
	void take() {
		System.out.println("Äà¹°ÀÌ ½Ï~ ³³´Ï´Ù.");
	}
}

class SneezeCap {
	void take() {
		System.out.println("ÀçÃ¤±â°¡ ¸Ü½À´Ï´Ù.");
	}
}

class SnuffleCap {
	void take() {
		System.out.println("ÄÚ°¡ »½ ¶Õ¸³´Ï´Ù.");
	}
}

class SinusCap {
	SinivelCap siCap = new SinivelCap();
	SneezeCap szCap = new SneezeCap();
	SnuffleCap sfCap = new SnuffleCap();
	
	void take() {
		siCap.take(); szCap.take(); sfCap.take();
		
	}
}

class ColdPatient {
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}

class OneClassEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());
	}
}