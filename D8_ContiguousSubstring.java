import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        int slen = s.length();
        int tlen = t.length();
        Boolean ans = false;
  
        if(slen >= tlen){
            for(int i=0; i <= slen-tlen; i++){
                if(s.charAt(i) == t.charAt(0)){
                    for(int j=1; j<tlen; j++){
                        if(s.charAt(i+j) == t.charAt(j))
                            ans = true;
                        else{
                            ans = false;
                            break;
                        }
                    }
                }
            }
        }

        if(ans == true)
            System.out.println("Yes");
        else    
            System.out.println("No");
    }
}
