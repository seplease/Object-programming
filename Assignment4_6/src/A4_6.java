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
		
		System.out.print("������ �Է¹޴� �л��� ����? : ");
		student = sc.nextInt();
		score = new int[student];
		
		while (i < score.length) {
			System.out.print(i + 1 + "��° �л��� ������ �Է��ϼ���: ");
			score[i] = sc.nextInt();
			i++;
		}
		
		for (i = 0; i < score.length; i++) {
			sum += score[i];
			average = (double)sum / student;
		}
		
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + average);

	}

}