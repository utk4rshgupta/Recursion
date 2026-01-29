public class countDigits {
    public static void main(String[] args) {
        System.out.println(digit(1666000));
    }
    static int digit(int n){
        if(n==0){
            return 0;
        }
        return 1 + digit(n/10);
    }
}
