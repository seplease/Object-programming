import java.util.Scanner;

public class DogTest {
	public static void main(String[] args) {
		String name;
		String type;
		
		Dog [] dogArray = new Dog[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < dogArray.length; i++) {
			System.out.print("pet의 이름을 입력하세요: ");
			name = sc.nextLine();
			System.out.print("pet의 종류를 입력하세요: ");
			type = sc.nextLine();
			dogArray[i] = new Dog(name, type);
		}

		System.out.println("** for문 **");
		for (int i = 0; i < dogArray.length; i++)
			System.out.println(dogArray[i].toString());

		
		System.out.println("** foreach문 **");
		for (Dog obj : dogArray)
			System.out.println(obj.toString());
	}
}