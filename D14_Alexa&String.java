import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int output = str.lastIndexOf("a")+1;
        if(output > 0)
            System.out.println(output);
        else
            System.out.println("-1");
    }
}
