import java.util.*;
public class A6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		float height;
		float weight;
		
		Person obj1;
		Person obj2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸���? : ");
		name = sc.next();
		System.out.print("Ű��? : ");
		height = sc.nextFloat();
		System.out.print("�����Դ�? : ");
		weight = sc.nextFloat();
		
		obj1 = new Person();
		obj1.print();
		
		obj2 = new Person(name, height, weight);
		obj2.print();
	}
}