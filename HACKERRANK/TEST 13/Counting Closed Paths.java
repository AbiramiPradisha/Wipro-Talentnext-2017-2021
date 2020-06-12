import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'closedPaths' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int closedPaths(int number) {
    // Write your code here
    //initialising a list named arr
    List<Integer> arr=new ArrayList<>();
    //to find no of digits in number
    int count=0;
    int m=number;
    while(m>0){
        count++;
        m/=10;
    }
    //to convert the given number into a list of integers
    for(int j=1;j<count;j++){
        int newel=number%10;
        arr.add(newel);
        number/=10;
        if(number<10){
            arr.add(number);
        }
    }
    //ini the return values(counts of closed path)
    int closedpath1=0;
    int closedpath2=0;
    int closedpath3=0;
    //body of program(main concept)-finding the no.of closed paths
    for(int i=0;i<arr.size();i++){
    if((arr.get(i)==0) || arr.get(i)==4 || arr.get(i)==6 || arr.get(i)==9){
        closedpath1++;
    }
    else if(arr.get(i)==8){
        closedpath2=closedpath2+2;
    }
    else{
        closedpath3=0;
    }
    }
    return closedpath1+closedpath2+closedpath3;
    }
}

 public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.closedPaths(number);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
