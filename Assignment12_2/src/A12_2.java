import java.util.Scanner;

public class A12_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		GoodCalc obj = new GoodCalc();

		System.out.println("합을 구하려는 두수를 입력하시오");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("합 : " + obj.add(num1, num2));
		System.out.println("차 : " + obj.sub(num1, num2));
		System.out.println("배열{1,2,3}의 평균 : " + obj.avg(arr));
	}
}