import java.util.Scanner;

public class A6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width;
		int height;
		int areaTest;
		
		Rectangle obj;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 가로를 입력: ");
		width = sc.nextInt();
		System.out.print("사각형의 세로를 입력: ");
		height = sc.nextInt();
		
		obj = new Rectangle(width, height);
		areaTest = obj.area(width, height);
		System.out.println("사각형의 넓이는 " + areaTest + "이다.");
	}

}
