public class NthFibbonacci {

	public static void main(String[] args) {
		fibbo(5);
	}
	public static long fibbo(int input1) {
		List<Integer> fib=new ArrayList<>();
		fib.add(0);
		fib.add(1);
		for(int i=0;i<input1;i++){
			int total=fib.get(i)+fib.get(i+1);
			fib.add(total);
		}
		return fib.get(input1-1);
	}

}
