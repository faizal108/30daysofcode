import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        if (K % 2 == 0)
        {
            double x = N / K;
            double y = (N + (K / 2)) / K;
    
            count = (int)(x * x * x + y * y * y);
        }
        else
        {
            int x = N / K;
            count = (int)(x * x * x);
        }
        System.out.println(count);
    }
}