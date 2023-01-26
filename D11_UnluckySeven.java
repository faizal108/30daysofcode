import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!containsSeven(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean containsSeven(int num) {
        if (Integer.toString(num).contains("7")) {
            return true;
        }
        if (Integer.toOctalString(num).contains("7")) {
            return true;
        }
        return false;
    }
}
