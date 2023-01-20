import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int t = sc.nextInt();

		int result = 0;

		for (int i = 0; i <= s; i++)
			for (int j = 0; j <= s - i; j++)
				for (int k = 0; k <= (s - i - j); k++)
					if (i + j + k <= s && i * j * k <= t)
						result++;

		System.out.println(result);
    }
}