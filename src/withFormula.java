public class withFormula {
    static  int fiboFormula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5) )/2 ),n )/ Math.sqrt(5));
    }
    public static void main() {
        System.out.println(fiboFormula(3));
    }
}
