package Strings;

public class skipAWord {
    public static void main(String[] args) {
        skip("", "abcgfAppleajfb");
        System.out.println(skip2("abcgfAppleajfb"));
    }

    static void skip(String ans, String que) {
        if (que.isEmpty()) {
            System.out.println(ans);
            return;
        }

        if (que.startsWith("Apple")) {
            skip(ans, que.substring(5));
        } else {
            skip(ans + que.charAt(0), que.substring(1));
        }
    }

        static String skip2(String que){
            if (que.isEmpty()) {
                return "";
            }

            if (que.startsWith("Apple")) {
                return skip2(que.substring(5));
            } else {
                return que.charAt(0) + skip2(que.substring(1));
            }
        }
    }

