import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len = str1.length()-1;

        for(int i=0; i<len; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                str2 = swap(str2,i,i+1);
                break;
            }
        }

        if(str1.equals(str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static String swap(String str,int a,int b){
        StringBuilder sb = new StringBuilder(str);
        char ch1 = sb.charAt(a),ch2 = sb.charAt(b);
        sb.setCharAt(a,ch2);
        sb.setCharAt(b,ch1);
        
        return sb.toString();

    }
}
