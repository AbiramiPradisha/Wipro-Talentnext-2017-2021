public class Of5GivenNosHowManyAreEven {

	public static void main(String[] args) {
		 even(12,35,-97,-98,0);
	}
	public static int even(int inp1,int inp2,int inp3,int inp4,int inp5) {
		int count=0;
		int[] arr= {inp1,inp2,inp3,inp4,inp5};
		for(int i=0;i<5;i++) {
			if(arr[i]%2==0) {
				count=count+1;
			}
		}
		return count;
		
	}

}
