package Test;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
/* �������� �����
class WordGenerator extends Thread {
	public void run() {
		Vector words = new Vector();
	String[] data;
	int interval = 2 * 1000; // 2��	
	
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
	static String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };// static

	int interval = 2 * 1000; // 2��
	WordGenerator wg = new WordGenerator();

	public static void main(String args[]) {
		KeybordGameTest game = new KeybordGameTest();
		game.wg.start();
		Vector words = game.words;
//		WordGenerator wg = new WordGenerator(); //
//		Vector words = new Vector();//
//		wg.setData(); // geter, seter ����� ��� ��.
//		wg.start();//

		while (true) {
			System.out.println(words);
			String prompt = ">>";
			System.out.print(prompt);
			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input); // �ȿ� �ִ� �ε��� ��ȣ ����� �ε����� ����. ���� ������ ������ -1�� ����.

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
//�̳� Ŭ����