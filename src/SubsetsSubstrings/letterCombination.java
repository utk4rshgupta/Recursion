package SubsetsSubstrings;

public class letterCombination {
    static void main(String[] args) {
        //pad("","12");
        padReal("","22");
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+ i);
            pad(p+ch,up.substring(1));
        }
    }

    static void padReal(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        String[] map = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };
        int digit = up.charAt(0) - '0';
        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            padReal(p + ch, up.substring(1));
        }
    }

}
