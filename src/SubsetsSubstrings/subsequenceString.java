package SubsetsSubstrings;

import java.util.ArrayList;

public class subsequenceString {
    //using recursion
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseq1("","abc"));
        subseq2(" ","abc");
        System.out.println(list);
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p,up.substring(1));
        subseq(p+ch,up.substring(1));
    }


    // add it in a arrayList
    static ArrayList<String> subseq1(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> right = subseq1(p,up.substring(1));
        ArrayList<String> left = subseq1(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }


    //call an arraylist from outside of method
    static ArrayList<String> list = new ArrayList<>();
    static void subseq2(String p, String up) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        // include
        subseq2(p+ch, up.substring(1));
        // exclude
        subseq2(p , up.substring(1));
    }





}
