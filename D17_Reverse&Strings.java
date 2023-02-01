import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        String str= sc.next();

        List<Character> chrarr = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            chrarr.add(ch);
        }

        for(; l < r ; l++,r--){
            char temp = chrarr.get(l-1);
            chrarr.set(l-1,chrarr.get(r-1));
            chrarr.set(r-1,temp);
        }
        
        StringBuilder sb = new StringBuilder();
         for (Character ch : chrarr) {
            sb.append(ch);
        }
        str = sb.toString();
        System.out.println(str);

    }
}
