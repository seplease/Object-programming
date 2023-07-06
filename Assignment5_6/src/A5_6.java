import java.util.Scanner;

public class A5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String address;
		
		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();
		System.out.print("주소를 입력하세요: ");
		address = sc.nextLine();
		
		address(name, address);
	}

	public static void address(String n, String a) {
		System.out.println(n + "의 주소는 " + a + "입니다.");
	}
}