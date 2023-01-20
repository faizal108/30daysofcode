import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count=0;
        for(int i=n+1;i<m && count < 5; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
                count++;
            }

        }
    }
}