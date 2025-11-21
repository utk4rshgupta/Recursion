public class revastring {
    public static void main(String[] args) {
    String str = "utkarsh";
     rev(str);
    }
    public static void rev(String s){
        if(s.equals("")){
            return;
        }
        rev(s.substring(1));
        System.out.print(s.charAt(0));

    }
}
