import java.util.Scanner;
public class Test1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double f;
		double c;
		
		System.out.print("ȭ���µ��� �Է��Ͻÿ�: ");
		f = sc.nextDouble();
		
		c = (5.0 / 9.0) * (f - 32);
		System.out.print("�����µ��� " + c);
	}
}