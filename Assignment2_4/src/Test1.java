import java.util.Scanner;
public class Test1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double f;
		double c;
		
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		f = sc.nextDouble();
		
		c = (5.0 / 9.0) * (f - 32);
		System.out.print("¼·¾¾¿Âµµ´Â " + c);
	}
}