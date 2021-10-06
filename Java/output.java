import java.util.Scanner;
public class output
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] A = new String[3];
        int[] B = new int[3];
        for (int i  = 0; i<3 ;i++)
        {
            A[i] = sc.next();
            B[i] = sc.nextInt();
        }
        System.out.println("================================");
        for (int i = 0; i< 3 ; i++)
        {
            if (A[i].length() != 15 )
            {
                for (int b =0 , count = 15 - A[i].length();b < count  ; b++)
                {
                    A[i] = A[i] + " ";
                }
                System.out.printf("%s",A[i]);
            }
            else 
            {
                System.out.printf("%s",A[i]);
            }
            if ((B[i] >= 0) & (B[i] <10) )
            {
                System.out.println("00"+B[i]);
            }
            else if(B[i] < 100)
            {
                System.out.println("0"+B[i]);
            }
            else 
                 System.out.println(B[i]);

        }
        System.out.println("================================");
    }
}