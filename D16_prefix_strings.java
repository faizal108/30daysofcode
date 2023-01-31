import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String preString = sc.nextLine();
        String mainString = sc.nextLine();
        boolean output = false;

        if(preString.length() <= mainString.length()){
            for(int i=0; i<preString.length(); ++i){
            if(preString.charAt(i) == mainString.charAt(i))
                output = true;
            else{
                output = false;
                break;
            }
        }
        }

        if(output == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
