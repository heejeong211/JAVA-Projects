
public class OperatePromotion {
	
	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;
	    short result = (short)(num1 + num2); //4바이트 짜리를 2바이트로 짤라야 하기 때문에 위험부담이 큼.
		//int result = num1 + num2;
		System.out.println(result);
	}

}

//컴파일 에러는 정수형 덧셈 시 자료형에 상관없이 int형 덧셈을 진행함을 의미한다.
//캐스팅 하거나 아니면 int로 고쳐줘야 함.