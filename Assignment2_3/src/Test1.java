import java.util.Scanner;
public class Test1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int take, price, surtax, rest;
		
		System.out.print("���� ��: ");
		take = sc.nextInt();
		
		System.out.print("��ǰ ����: ");
		price = sc.nextInt();
		
		surtax = price / 10;
		System.out.print("�ΰ���: " + surtax + "\n");
		
		rest = take - price;
		System.out.print("�ܵ�: " + rest);
	}
}