package SubsetsSubstrings;

public class permutations {
    public static void main(String[] args) {
        permutations("", "abc");
        System.out.println(permutationsCount("","abc"));
    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(i, p.length());
            String f = p.substring(0, i);
            permutations(f + ch + s, up.substring(1));
        }
    }

    static int permutationsCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(i, p.length());
            String f = p.substring(0, i);
            count += permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
