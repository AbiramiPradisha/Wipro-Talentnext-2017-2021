import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
         int k=s.nextInt();
         if(k<0)
         {
            System.out.println("negative"); 
         }
         else if(k>0)
         {
             System.out.println("positive");
         }
         else
         {
             System.out.println("zero");
         }
	}
}
