import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'stockPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY stocksProfit
     *  2. LONG_INTEGER target
     */

    static int maxProfit(int price[], int n)
    {
        int profit[] = new int[n];
        for(int i=0; i<n; i++)
            profit[i] = 0;
        int max_price = price[n-1];
        for (int i=n-2;i>=0;i--)
        {
            if(price[i] > max_price)
               max_price = price[i];
               profit[i] = Math.max(profit[i+1], max_price-price[i]); 
        }
        int min_price = price[0];
        for(int i=1; i<n; i++)
        {
            if(price[i] < min_price)
            min_price = price[i];
            profit[i] = Math.max(profit[i+1], profit[i] + (price[i]-min_price));
        }
        int result = profit[n-1];
        return result;
    }
    public static void main(String[] args)
    {
        int price[] = {6,1,3,46,1,3,9,47};
        int n = price.length;
        System.out.println(+maxProfit(price, n));
    }

}
