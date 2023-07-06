import java.util.Scanner;

public class A7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		str = sc.next();
		System.out.print("대문자로 변환: ");
		System.out.print(str.toUpperCase());
		System.out.println();
		System.out.print("거꾸로 출력: ");
		for (i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
