package Test;

import java.util.Arrays;
import java.util.Random;

class LottoNum implements ILottoNum{
		
	int[] lotto;
	
	@Override
	public int[] randomNum() {
		Random rand = new Random();
		lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
		//	lotto[i] = (int)(Math.random()*45)+1;
			lotto[i] = rand.nextInt(45) +1;
			
			//중복제거
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					
					System.out.println("중복입니다." + i + "==" + j);
					break;
				}
			}
		
		}
		return lotto;
	}
	
	public void printLottoNum() {
		System.out.println(Arrays.toString(lotto)); // lotto 배열의 내용물을 가져옴.
	}

}

class LottoTest {
	public static void main(String[] args) {
		ILottoNum lottoNum = new LottoNum();
		lottoNum.randomNum();
		((LottoNum)lottoNum).printLottoNum(); // 형변환 해줘야 함. printLottoNum은 오버라이딩 안해줬기 때문.
	}
}
