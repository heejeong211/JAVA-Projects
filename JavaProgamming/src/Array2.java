
public class Array2 {

	public static void main(String[] args) {
		int[][] arr = {
				{11},
				{22, 33},
				{44, 55, 66}
		};
		
		// 배열의 구조대로 내용 출력
		for(int i = 0; i < arr.length; i++) { // 3행 뽑아내야함.
			for(int j = 0; j < arr[i].length; j++) { // 3열 뽑아내야함. 저 i에 행의 숫자 하나 넣으면 그 행만 출력됨.
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
