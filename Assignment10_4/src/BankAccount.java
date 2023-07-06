
public class BankAccount {

	public static void main(String[] args) {
		Account myAccount1 = new Account();
		Account myAccount2 = new Account();
		myAccount1.deposit(10000);		
		System.out.println("myAccount1 : " + myAccount1);
		myAccount2.deposit(30000);		
		System.out.println("myAccount2 : " + myAccount2);
		myAccount2.withdraw(5000);		
		System.out.println("myAccount2 : " + myAccount2);
		myAccount1.transfer(5000, myAccount2);
		System.out.println("myAccount1 : " + myAccount1);
		System.out.println("myAccount2 : " + myAccount2);
	}
}