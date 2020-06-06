public class ReturnLastDigit {

	public static void main(String[] args) {
		lastdig(197);
	}
	public static int lastdig(int input1) {
		int lastdigit;
		lastdigit=Math.abs(input1%10);
		return lastdigit;
	}

}
