package SubsetsSubstrings;

import java.util.ArrayList;
import java.util.List;

public class Realnumpad {
    public static void main(String[] args) {
        pad("","2");
        List<String> ans = pad2("","34");
            System.out.println(ans);
    }
    static void pad(String p, String up) {
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
            pad(p + ch, up.substring(1));
        }
    }

    static List<String> pad2(String p, String up){
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
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
        List<String> list = new ArrayList<>();
        String letters = map[digit];
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(pad2(p + ch,up.substring(1)));
        }
        return list;
    }

}
