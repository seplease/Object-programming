import java.util.Scanner;

public class A5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("������ �Է��ϼ���: ");
		num = sc.nextInt();
		abs(num);		
	}
	
	public static void abs(int n) {
		System.out.println("�Էµ� ���� " + n + "�� ���밪�� " + Math.abs(n) + "�Դϴ�.");
	}
}
