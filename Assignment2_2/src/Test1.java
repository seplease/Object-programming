import java.util.Scanner;
public interface Test1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double mile, km;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		mile = sc.nextDouble();
		
		km = mile * 1.609;
		
		System.out.print(mile + "������ " + km + "ų�ι����Դϴ�.");
	}
}