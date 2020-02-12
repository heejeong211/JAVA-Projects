import java.util.Random;

public class RandomTest1 {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 7; i++) {
			System.out.println(rand.nextInt(1000));
		}
		

	}

}

class RandomTest2 {
	
	public static void main(String[] args) {
		Random rand = new Random(12);
		for (int i = 0; i < 7; i++) {
			System.out.println(rand.nextInt(1000));
		}
		

	}
}