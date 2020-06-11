public class PrimeNumberOrNot {

	public static void main(String[] args) {
		prime(90);

	}
	public static void prime(int input1) {
		int count=0;
		for(int i=2;i<input1;i++){
			if(input1%i==0){
				count++;
			}
		}
		if(count==0){
			return 2;
		}
		else{
			return 1;
		}
		
	}

}
