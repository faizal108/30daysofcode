import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        
        if(X*Y >= 0 && X>=0){
            if(Y>X)
                System.out.println(X);
            else if(Z>Y && X>Y)
                System.out.println("-1");
            else if(Z>Y)
                System.out.println(X);
        }
        else if(X*Y>=0 && X<=0 && Y<=0){
            if(X>Y || (X<Y && Z<=0 && Y<Z))
                System.out.println(Math.abs(X));
            else if (X<Y && Y<Z)
                System.out.println(2*Z-X);
            else if (Y>Z)
                System.out.println(-1);
        }
        else if(X*Y<=0 && X>=0)
            System.out.println(X);
        else if(X*Y<=0 && Z>=0)
            System.out.println(Math.abs(X));
        else
            System.out.println(-1);
            
    }
}
