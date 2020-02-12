
public class BankAccountPO {
	
	static int balance = 0; //예금 잔액    //이렇게 함수 밖에 변수를 정의해도 됨. 이렇게 변수 정의하면 모든 함수들이 이 변수를 사용할 수 있음.
	
	public static void main(String[] args) {
		deposit(10000); //입금 진행
		checkMyBalance(); //잔액확인
		withdraw(3000); //출금 진행
		checkMyBalance(); //잔액확인
	}
	
	public static int deposit(int amount) { //입금
		balance += amount;
		return balance;
	}
	
	public static int withdraw(int amount) { //출금
		balance -= amount;
		return balance;
	}
	
	public static int checkMyBalance() { //예금 조회
		System.out.println("잔액: " + balance);
		return balance;
	}
 
}
