import java.util.*;

public class A4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int student;
		int i = 0;
		int sum = 0;
		double average = 0.0;
		int[] score;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력받는 학생의 수는? : ");
		student = sc.nextInt();
		score = new int[student];
		
		while (i < score.length) {
			System.out.print(i + 1 + "번째 학생의 성적을 입력하세요: ");
			score[i] = sc.nextInt();
			i++;
		}
		
		for (i = 0; i < score.length; i++) {
			sum += score[i];
			average = (double)sum / student;
		}
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);

	}

}