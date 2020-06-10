public class Of5NumsReturnTheNoOfEvenAndOdd {

public static void main(String[] args) {
    evenoddss(1,2,3,4,5,"odd");
		
	}


public static void evenoddss(int input1,int input2,int input3,int input4,int input5,String input6){
    int[] arr={input1,input2,input3,input4,input5};
		int evencount=0;
		int oddcount=0;
		//String input6="even";
		
		if(input6.equals("even")){
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2==0){
					evencount=evencount+1;
			    }
			}

			return evencount;
		}
		else{
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2!=0){
					oddcount=oddcount+1;
			    }
			}
			return oddcount;
		}
 }  
 }
 
    
    
