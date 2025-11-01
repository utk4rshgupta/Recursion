

public class Recursion {
    public static void main() {
        System.out.println(fibo(30));
    }
    static int fibo(int n ){
        if(n<2){
            return n;
        }
        else
            return fibo(n-1)+fibo(n-2);
    }
    }

