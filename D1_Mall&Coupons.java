import java.io.*; 
import java.util.*; 

class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int N = sc.nextInt();
          int K = sc.nextInt();
          int X = sc.nextInt();

          // getting N inputs
          int[] arr = new int[N];
          for (int i = 0; i < N; i++) {
               arr[i] = sc.nextInt();
          }


          for (int i = 0; i < N; i++) {
               if(K == 0){
                    break;
               }
               int count = Math.min(K, arr[i]/X);
               arr[i] -= count * X;
               K -= count;
          }

          Arrays.sort(arr);

          long sum = 0;

          for(int i=0; i<N-K; i++){
               sum += arr[i];
          }

          System.out.println(sum);
     }

}