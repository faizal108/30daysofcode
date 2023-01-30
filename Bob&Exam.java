import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        short a = sc.nextShort();
        short b = sc.nextShort();

        System.out.println((a&b)+(a^b));

    }
}
