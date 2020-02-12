package Test;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
/* 선생님이 만든거
class WordGenerator extends Thread {
	public void run() {
		Vector words = new Vector();
	String[] data;
	int interval = 2 * 1000; // 2초	
	
	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	public Vector getWords() {
		return words;
	}

	public void setWords(Vector words) {
		this.words = words;
	}

	public void run() {
	while(true) {
			int rand = (int)(Math.random()*data.length);

			words.add(data[rand]);			

			try {
				Thread.sleep(interval);
			} catch(Exception e) { }

		}
	}
}*/

public class KeybordGameTest {

	Vector words = new Vector();
	static String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };// static

	int interval = 2 * 1000; // 2초
	WordGenerator wg = new WordGenerator();

	public static void main(String args[]) {
		KeybordGameTest game = new KeybordGameTest();
		game.wg.start();
		Vector words = game.words;
//		WordGenerator wg = new WordGenerator(); //
//		Vector words = new Vector();//
//		wg.setData(); // geter, seter 만들어 줘야 함.
//		wg.start();//

		while (true) {
			System.out.println(words);
			String prompt = ">>";
			System.out.print(prompt);
			// 화면으로부터 라인단위로 입력받는다.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input); // 안에 있는 인덱스 번호 양수로 인덱스가 나옴. 만약 없으면 음수인 -1이 나옴.

			if (index != -1) {
				words.remove(index);
			}

		} 

	}

	class WordGenerator extends Thread {
		public void run() {
			while(true) {
				Random rand = new Random();
				int num = rand.nextInt(9);
				words.add(data[num]);
				try {
					Thread.sleep(2 * 1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}

	}

}
//이너 클래스