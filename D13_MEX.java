import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        short n = sc.nextShort();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(short i=0; i<n ;++i){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        Set<Integer> set = new LinkedHashSet<Integer>();
        set.addAll(arr);

        arr.clear();
        arr.addAll(set);
        int j =0;
        for(int i: arr){
            if(i != j){
                break;
            }
            j++;
        }
        System.out.println(j);
    }
}
