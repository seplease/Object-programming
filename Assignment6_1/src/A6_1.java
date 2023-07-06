import java.util.*;
public class A6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int month;
		int day;
		
		Date obj;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요: ");
		year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요: ");
		month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		day = sc.nextInt();
		
		obj = new Date(year, month, day);
		obj.print();
	}

}
