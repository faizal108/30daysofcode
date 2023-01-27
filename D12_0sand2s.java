import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static List<Integer> result = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();

        while(k != 0){
            result.add((int) (long) (k%2));
            k /= 2;
        }
        int Lsize = result.size();
        for(int i = Lsize-1; i >= 0; --i){
            int res = (result.get(i) != 0)? 2:0;
            System.out.print(res);
        }
    }
}
