import java.util.*;

public class A6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int rollno;
		int age;
		
		Student obj;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�.: ");
		name = sc.next();
		System.out.print("�й��� �Է��Ͻÿ�.: ");
		rollno = sc.nextInt();
		System.out.print("���̸� �Է��Ͻÿ�.: ");
		age = sc.nextInt();
		
		obj = new Student(name, rollno, age);
		obj.print();
	}
}