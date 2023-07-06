import java.util.Scanner;

public class A5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		sum obj;
		obj = new sum();
		
		System.out.print("정수를 입력하세요: ");
		x = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		y = sc.nextInt();
		
		obj.sum(x, y);
	}

}
