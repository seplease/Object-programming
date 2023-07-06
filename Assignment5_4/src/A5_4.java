import java.util.Scanner;

public class A5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하세요: ");
		num = sc.nextInt();
		abs(num);		
	}
	
	public static void abs(int n) {
		System.out.println("입력된 정수 " + n + "의 절대값은 " + Math.abs(n) + "입니다.");
	}
}
