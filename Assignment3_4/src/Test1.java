import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i = 0;
		int j = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���Ϸ��� ������ ���ڸ� �Է��ϼ���: ");
		num = sc.nextInt();
		
		while (i <= num) {
			if (i % 3 == 0)
			{
				System.out.print(i + "\t");
				j++;
				sum += i;
				if (j % 5 == 0)
					System.out.println("");
			}
			i++;
		}
		System.out.println("\n0���� " + num + "������ 3�� ����� ��: " + sum);
	}
}