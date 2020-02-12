
class BankAccount {
	
	int balance = 0;  // 예금 잔액, balance라는 이름으로 4바이트 메모리를 잡음.
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액: " + balance);
		return balance;
	}

}
