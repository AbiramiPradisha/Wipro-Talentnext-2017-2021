public class ReturnSecondlastDigit {

	public static void main(String[] args) {
		supert(-50);

	}
	public static int supert(int input1) {
		if(Math.abs(input1)>9){

        int seclastdig=Math.abs((input1/10)%10);
		    return seclastdig;
		    //System.out.println(seclastdig);
		}
		else{
			return -1;
			//System.out.println("-1");
		}
	}

}
