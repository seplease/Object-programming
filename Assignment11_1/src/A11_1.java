import java.util.*;
public class A11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		
		b0.setName("��ź");
		b0.setBalance(100);
		b0.setInterest0(3.5);
		b1.setName("�ҳ�");
		b1.setBalance(2000);
		b1.setInterest1(2.1);
		b2.setName("������");
		b2.setBalance(500);
		b2.setInterest2(3.25);
		
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println();
		System.out.print("����" + b0.getAccNo() + "�� �Ա��� �ݾ��� �Է��ϼ���:");
		if (b0.deposit(sc.nextInt()) == true)
			System.out.println("�Ա��� �����߽��ϴ�.");
		else
			System.out.println("�Ա��� �����߽��ϴ�.");
		System.out.println();
		
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("����" + b1.getAccNo() + "���� ����� �ݾ��� �Է��ϼ���:");
		if (b1.withdraw(sc.nextInt()) == true)
			System.out.println("����� �����߽��ϴ�.");
		else
			System.out.println("����� �����߽��ϴ�.");
		System.out.println();
		
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("����" + b1.getAccNo() + "���� " + b2.getAccNo() + "���� �۱��� �ݾ��� �Է��ϼ���:");
		if(BankAccount.transfer(b1, b2, sc.nextInt()) == true)
			System.out.println("�۱��� �����߽��ϴ�.");
		else
			System.out.println("�۱��� �����߽��ϴ�.");
		System.out.println();
		
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}