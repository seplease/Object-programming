import java.util.Scanner;

public class A7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int month;
		int day;
		
		Date obj = new Date();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요: ");
		year = sc.nextInt();//obj.setYear(sc.nextInt()); 이렇게 한 줄로 써도 됨
		obj.setYear(year);
		System.out.print("태어난 월을 입력하세요: ");
		month = sc.nextInt();
		obj.setMonth(month);
		System.out.print("태어난 날짜를 입력하세요: ");
		day = sc.nextInt();
		obj.setDay(day);
		
		print(obj);
	}

	public static void print(Date day) {
		System.out.print("당신의 생일은 " + day.getYear() + "년 " +
	day.getMonth() + "월 " + day.getDay() + "일입니다.");
		System.out.print("현재 나이는 " + day.getAge() + "입니다.");
		System.out.print(true && false && false || true);
	}
}
