
public class Account {
	private Account accountNumber;
	private Account owner;
	private int balance = 0;

	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}
	
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}

	void transfer(int amount, Account otherAccount) {
		System.out.println("transfer(" + amount + "원)");
		balance -= amount;
		otherAccount.deposit(amount);
	}
}