package Test;

import java.util.HashSet;
import java.util.Set;

public class LottoDemo {

	public static void main(String[] args) {
		Set<Integer> setLotto = new HashSet<>(); // �ߺ����� ����.. // HashSet�� TreeSet���� �ٲ��ָ� �����ؼ� ����.
		while(setLotto.size() < 6) {
			setLotto.add((int)(Math.random()*45) +1); // set.add�ȿ� ������ ����....
		}
		System.out.println(setLotto);

	}

}
