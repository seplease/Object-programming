
public class A4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum = 0;
		
		for (i = 0; i <= 100; i++) {
			if (i % 3 == 0 || i % 4 == 0)
				sum += i;
		}
		System.out.println("3 �Ǵ� 4�� ����� ��=" + sum);
		
	}

}
