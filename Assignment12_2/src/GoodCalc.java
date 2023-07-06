
public class GoodCalc extends Calculator {

	public int add(int n1, int n2)	{
		return n1 + n2;
	}

	public int sub(int n1, int n2) {
		return n1 - n2;
	}

	public double avg(int[] arr) {
		int average = 0;
		int total = 0;
		for(int i = 0; i < arr.length; i++)
			total += arr[i];
		average = total / 3;
		return average;
	}
}