public class SumOfLastDigitsOfTwoNumbers {

	public static void main(String[] args) {
		sumoflastdigits(-195,8976);

	}
	public static int sumoflastdigits(int input1,int input2) {
		int sum=Math.abs(input1%10)+Math.abs(input2%10);
		return sum;
		
	}

}
