import java.util.Scanner;
public class Test1 {
	public static void main(String args[]) {
		Scanner orange = new Scanner(System.in);
		int all, box, rest;
		
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		all = orange.nextInt();
		
		box = all / 10;
		rest = all % 10;
		
		System.out.print(box + "�ڽ��� �ʿ��ϰ� " + rest + "���� �����ϴ�.");
	}
}