import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Result {
    static int maxXORInRange(int L, int R)
    {
        int LXR = L ^ R;
        int msbPos = 0;
        while (LXR > 0)
        {
            msbPos++;
            LXR >>= 1;
        }
        int maxXOR = 0;
        int  two = 1;
        while (msbPos-- >0)
        {
            maxXOR += two;
            two <<= 1;
        }
        return maxXOR;
    }
    public static void main(String[] args)
    {
        int L = 8;
        int R = 20;
        System.out.println(maxXORInRange(L, R));
    }
}
