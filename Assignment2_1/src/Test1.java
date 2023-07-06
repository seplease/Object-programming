import java.util.Scanner;
public class Test1 {
	public static void main(String args[]) {
		Scanner orange = new Scanner(System.in);
		int all, box, rest;
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		all = orange.nextInt();
		
		box = all / 10;
		rest = all % 10;
		
		System.out.print(box + "박스가 필요하고 " + rest + "개가 남습니다.");
	}
}