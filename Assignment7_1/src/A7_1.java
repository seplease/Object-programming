import java.util.Scanner;

public class A7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int month;
		int day;
		
		Date obj = new Date();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		year = sc.nextInt();//obj.setYear(sc.nextInt()); �̷��� �� �ٷ� �ᵵ ��
		obj.setYear(year);
		System.out.print("�¾ ���� �Է��ϼ���: ");
		month = sc.nextInt();
		obj.setMonth(month);
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		day = sc.nextInt();
		obj.setDay(day);
		
		print(obj);
	}

	public static void print(Date day) {
		System.out.print("����� ������ " + day.getYear() + "�� " +
	day.getMonth() + "�� " + day.getDay() + "���Դϴ�.");
		System.out.print("���� ���̴� " + day.getAge() + "�Դϴ�.");
		System.out.print(true && false && false || true);
	}
}
