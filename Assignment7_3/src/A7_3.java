import java.util.Scanner;

public class A7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = sc.next();
		System.out.print("�빮�ڷ� ��ȯ: ");
		System.out.print(str.toUpperCase());
		System.out.println();
		System.out.print("�Ųٷ� ���: ");
		for (i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
