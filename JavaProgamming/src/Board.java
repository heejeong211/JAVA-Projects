
class Board { }

class PBoard extends Board { }

class ClassCast {
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1; // OK!
		
		System.out.println("... intermediate lovation ...");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1; // Exception! 컴파일에러 못 잡는 이유.
	}
}

// 동적생성이기 때문에 컴파일에러 못 잡음. -> new를 실행하고 나서 확인해야 하기 때문에 미리 텍스트로만 판단 못함.