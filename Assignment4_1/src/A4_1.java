import java.util.*;
public class A4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int answer;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		answer = (int) (Math.random() + 100);
		
		while(true) {
			System.out.print("������ �����Ͽ� ������: ");
			num = sc.nextInt();
			i++;
			if (num > answer)
				System.out.println("LOW");
			else if (num < answer)
				System.out.println("HIGH");
			else if (num == answer)
				System.out.println("�����մϴ�. �õ�Ƚ�� = " + i);
		}
	}

}
