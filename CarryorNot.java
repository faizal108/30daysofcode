import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Long a = sc.nextLong();
        Long b = sc.nextLong();
        boolean output = true;

        while(b > 0){
            Long sum = (a%10)+(b%10);
            if(sum > 9){
                output = false;
                break;
            } 
            a /= 10;
            b /= 10;
        }

        if(output == true)
            System.out.println("Easy");
        else
            System.out.println("Hard");
    }
}
