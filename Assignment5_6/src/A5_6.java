import java.util.Scanner;

public class A5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String address;
		
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ���: ");
		address = sc.nextLine();
		
		address(name, address);
	}

	public static void address(String n, String a) {
		System.out.println(n + "�� �ּҴ� " + a + "�Դϴ�.");
	}
}