package Test;

public class Test1 {
	
	public static void main(String[] args) {
		/*
		 * 1. 아무리 간단한 프로그램도 설계를 한다. 설계(요구사항분석) -> 코딩 -> 테스트 -> 배포
		 * 2. 요구사항 부넉을 한다. (평균같은 경우에는 더블형을 쓴다.)
		 * 3. 변수를 정의하여 본다.
		 * */
	
		int kor = 60;
		int math = 70;
		int eng = 100;
		
		int total;
		double avg;
		char grade;
		
		total = kor + math + eng;
		avg = total / (double)3; //total도 int고 3도 int이기 때문에 3.0으로 하던지 아니면 double로 명시적 형변환 해야 함.
		
		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) { 
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		
		System.out.println("당신의 총점은: " + total);
		System.out.println("당신의 평균은: " + avg);
		System.out.println("당신의 성적은: " + grade);
		
		
		/*
		int korean = 60;
		int math = 70;
		int english = 100;
		
		System.out.println("총점: " + (korean + math + english));
		System.out.println("평균: " + ((korean + math + english)/3));
		
		if (((korean + math + english)/3) >= 90) {
			System.out.println("수");
		}else if (((korean + math + english)/3) >= 80) {
			System.out.println("우");
		}else if (((korean + math + english)/3) >= 70) {
			System.out.println("미");
		}else if (((korean + math + english)/3) >= 60) {
		    System.out.println("양");
		}else {
			System.out.println("가");
		} */
	}

}
