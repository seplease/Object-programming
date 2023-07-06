
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
		return "���� �ܾ��� " + balance + "�Դϴ�.";
	}

	void transfer(int amount, Account otherAccount) {
		System.out.println("transfer(" + amount + "��)");
		balance -= amount;
		otherAccount.deposit(amount);
	}
}