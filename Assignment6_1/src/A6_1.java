import java.util.*;
public class A6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int month;
		int day;
		
		Date obj;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		year = sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ���: ");
		month = sc.nextInt();
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		day = sc.nextInt();
		
		obj = new Date(year, month, day);
		obj.print();
	}

}
