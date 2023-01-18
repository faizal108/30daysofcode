import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int even = n / 2;
        int odd = n - even;
        System.out.println(even * odd);
    }
}