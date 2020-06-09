public class NIsTheExactMultipleOfM {

	public static void main(String[] args) {
		asd(8,4);
	}
	public static int asd(int input1,int input2) {
    if(input1==0 | input2==0){
			return 3;
		}
		else if(input1%input2==0){
			return 2;
		}
		else{
			return 1;
		}
	}

}
