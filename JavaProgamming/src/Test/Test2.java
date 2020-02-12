package Test;

public class Test2 {
	
	public static void main(String[] args) {
		//1부터 100까지의 합
		//1+2+3+4+5+...+100
		
		int total = 0;
		
		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}
		System.out.println(total);
		
		//1부터 100까지 숫자 중에 3의 배수
		 for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0) {
				System.out.println("3의 배수는 " + i + "입니다.");
			}
		}
		 total = 0;//위에서 total을 썼기 때문에 꼭 초기화 해 줘야함.
		 
		 for (int i = 1; i <= 100; i++) {
			 
			 if(i % 2 == 1 ) { //홀수 조건
				 total = total + i;
			 }	 
		}
		 System.out.println(total);
		 
		 int dan = 7;
		 
		 for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}

}

/*
int n = 1;

while (n <= 100) {
	System.out.println();
}
for (n = 1; n <= 100; n++) {
	if(n%3 == 0) {
		System.out.println(n);
	}
} */