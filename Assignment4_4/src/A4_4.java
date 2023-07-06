import java.util.Arrays;
public class A4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num = {1.0, 2.0, 3.0, 4.0};
		double sum = 0.0;
		double max = 0.0; // = num[0];
		
		System.out.print("toString() 로 출력 : ");
		System.out.println(Arrays.toString(num));
		for (double e : num) {
			System.out.print(e + " ");
			sum += e;
			if (e > max)
				max = e;
		}
		System.out.println("");
		System.out.println("합은 " + sum);
		System.out.println("최대값은 " + max);
	}

}
