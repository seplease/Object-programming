import java.util.Scanner;

public class DogTest {
	public static void main(String[] args) {
		String name;
		String type;
		
		Dog [] dogArray = new Dog[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < dogArray.length; i++) {
			System.out.print("pet�� �̸��� �Է��ϼ���: ");
			name = sc.nextLine();
			System.out.print("pet�� ������ �Է��ϼ���: ");
			type = sc.nextLine();
			dogArray[i] = new Dog(name, type);
		}

		System.out.println("** for�� **");
		for (int i = 0; i < dogArray.length; i++)
			System.out.println(dogArray[i].toString());

		
		System.out.println("** foreach�� **");
		for (Dog obj : dogArray)
			System.out.println(obj.toString());
	}
}