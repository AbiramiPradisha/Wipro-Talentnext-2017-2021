public class NthPrime {

	public static void main(String[] args) {
		nprime(3);
	}
	public static void nprime(int input1) {
		List<Integer> s=new ArrayList<>();
		int count2=0;
		int nofprime=0;
		for(int i=2;input1>nofprime;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					count2++;
				}
			}
			if(count2==0){
				s.add(i);
				nofprime=nofprime+1;
			}
			count2=0;
			
		}
		int m=s.get(input1-1);
    return m;
	}

}
