import java.util.Scanner;

public class A6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width;
		int height;
		int areaTest;
		
		Rectangle obj;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�簢���� ���θ� �Է�: ");
		width = sc.nextInt();
		System.out.print("�簢���� ���θ� �Է�: ");
		height = sc.nextInt();
		
		obj = new Rectangle(width, height);
		areaTest = obj.area(width, height);
		System.out.println("�簢���� ���̴� " + areaTest + "�̴�.");
	}

}
