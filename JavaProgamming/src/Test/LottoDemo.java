package Test;

import java.util.HashSet;
import java.util.Set;

public class LottoDemo {

	public static void main(String[] args) {
		Set<Integer> setLotto = new HashSet<>(); // 중복없이 나옴.. // HashSet을 TreeSet으로 바꿔주면 정렬해서 나옴.
		while(setLotto.size() < 6) {
			setLotto.add((int)(Math.random()*45) +1); // set.add안에 랜덤을 넣음....
		}
		System.out.println(setLotto);

	}

}
