
public class Switch {
	
	public static void main(String[] args) {
		int n = 3;
		
		switch(n) {
		case 1:
			System.out.println("Simple Jave");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default: //위에 해당하는 케이스가 없으면 탐.
			System.out.println("The best progamming language");
		}
		System.out.println("Do you like Java?");
	}

}
