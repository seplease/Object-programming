import java.util.Scanner;

public class A5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		sum obj;
		obj = new sum();
		
		System.out.print("������ �Է��ϼ���: ");
		x = sc.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		y = sc.nextInt();
		
		obj.sum(x, y);
	}

}
