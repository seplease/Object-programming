import java.util.Scanner;

public class A12_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		GoodCalc obj = new GoodCalc();

		System.out.println("���� ���Ϸ��� �μ��� �Է��Ͻÿ�");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("�� : " + obj.add(num1, num2));
		System.out.println("�� : " + obj.sub(num1, num2));
		System.out.println("�迭{1,2,3}�� ��� : " + obj.avg(arr));
	}
}