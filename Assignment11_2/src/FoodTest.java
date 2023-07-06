
public class FoodTest {

	public static void main(String[] args) {
		Bread b1 = new Bread();
		System.out.println(b1.name + ", " + b1.price);
		System.out.println("수량 : " + b1.num);
		System.out.println("**********");
		Drink d1 = new Drink();
		System.out.println(d1.name + ", " + d1.price);
		System.out.println("사이즈 : " + d1.size);
	}
}