import java.util.concurrent.atomic.AtomicInteger;
class Main {
    public static int findLargestSquare(int[][] M, int m, int n, AtomicInteger max_size)

    {
        if (m == 0 || n == 0){
        max_size.set(Integer.max(max_size.get(), M[m][n]));
        return M[m][n];
    }
    int left = findLargestSquare(M, m, n - 1, max_size);
    int top = findLargestSquare(M, m - 1, n, max_size);
    int diagonal = findLargestSquare(M, m - 1, n - 1, max_size);
    int size = 0;
    if (M[m][n] != 0){
        size = 1 + Integer.min(Integer.min(top, left),diagonal);
    }
    max_size.set(Integer.max(max_size.get(),size));
    return size;
    }
    public static void main(String[] args)
    {
        int[][] M = 
        {
            {0, 0, 1, 0, 1, 1},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 1, 1, 1, 1},            
            {1, 1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1},
        };
        AtomicInteger max_size = new AtomicInteger();

        findLargestSquare(M, M.length - 1, M[0].length - 1, max_size);
        System.out.print(+ max_size.get());
    }
}       
