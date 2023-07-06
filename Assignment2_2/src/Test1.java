import java.util.Scanner;
public interface Test1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double mile, km;
		
		System.out.print("마일을 입력하시오: ");
		mile = sc.nextDouble();
		
		km = mile * 1.609;
		
		System.out.print(mile + "마일은 " + km + "킬로미터입니다.");
	}
}