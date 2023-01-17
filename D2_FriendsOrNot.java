import java.io.*; 
import java.util.*; 

class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();
          int[] a = new int[n-1];
          int[] b = new int[n-1];

          int flag = -1;

          for (int i = 0; i < n-1; i++) {
               a[i] = sc.nextInt();
               b[i] = sc.nextInt();

               if(i > 0)
                    if(a[i] == a[i-1] || a[i] == b[i-1])
                         flag = a[i];
                    else if(b[i] == a[i-1] || b[i] == b[i-1])
                         flag = b[i];
          }

          int counter = 0;

          for (int i = 0; i < n-1 && flag != -1; i++) {
               if(a[i] == flag || b[i] == flag)
                    counter++;
               else{
                    System.out.println("No");
                    break;
               }
          }

          if(counter == n-1)
               System.out.println("Yes");
     }
}