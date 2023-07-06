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
			System.out.print("정답을 추측하여 보세요: ");
			num = sc.nextInt();
			i++;
			if (num > answer)
				System.out.println("LOW");
			else if (num < answer)
				System.out.println("HIGH");
			else if (num == answer)
				System.out.println("축하합니다. 시도횟수 = " + i);
		}
	}

}
