package Strings;

public class skipALetter {
    public static void main(String[] args) {
        skip("","abbaadfsddd");
        System.out.println(skip2("abbsccasa"));
    }

    static void skip(String ans,String que){
        if(que.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = que.charAt(0);
        if(ch =='a'){
            skip(ans,que.substring(1));
        }else{
            skip(ans+ch,que.substring(1));
        }
    }

    static String skip2(String que){
        if(que.isEmpty()){
            return "";
        }
        char ch = que.charAt(0);
        if(ch =='a'){
            return skip2(que.substring(1));
        }else{
            return ch+skip2(que.substring(1));
        }
    }
}
