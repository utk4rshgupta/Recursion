package Strings;

public class skipAWord {
    public static void main(String[] args) {
        skip("", "abcgfappleajfb");
        System.out.println(skip2("abcgfappleajfb"));
        System.out.println(skipappnotapple("appappleabcgfappappleajfb"));

    }

    static void skip(String ans, String que) {
        if (que.isEmpty()) {
            System.out.println(ans);
            return;
        }

        if (que.startsWith("apple")) {
            skip(ans, que.substring(5));
        } else {
            skip(ans + que.charAt(0), que.substring(1));
        }
    }

        static String skip2(String que){
            if (que.isEmpty()) {
                return "";
            }

            if (que.startsWith("apple")) {
                return skip2(que.substring(5));
            } else {
                return que.charAt(0) + skip2(que.substring(1));
            }
        }

        //skip app not apple
        static String skipappnotapple(String que){
            if (que.isEmpty()) {
                return "";
            }

            if (que.startsWith("app") && !que.startsWith("apple")) {
                return skipappnotapple(que.substring(3));
            } else {
                return que.charAt(0) + skipappnotapple(que.substring(1));
            }
        }
    }

