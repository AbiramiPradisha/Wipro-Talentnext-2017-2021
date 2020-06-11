public class FactorialOfANumber {

	public static void main(String[] args) {
		fact(5);
	}
	public static void fact(int input1) {
    int mul=1;
		for(int i=1;i<=input1;i++){
			mul=mul*i;
		}
		return mul;
  }
}
    
