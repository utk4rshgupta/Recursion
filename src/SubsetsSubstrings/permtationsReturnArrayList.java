package SubsetsSubstrings;

import java.util.ArrayList;

public class permtationsReturnArrayList {
    public static void main(String[] args){
        ArrayList<String> ans = new ArrayList<>();
        ans =  permutationsArray("","adbc");
        System.out.println(ans);
    }
    static int count =0;
    static ArrayList<String> permutationsArray(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++){
            String s = p.substring(i,p.length());
            String f = p.substring(0,i);
            ans.addAll(permutationsArray(f+ch+s,up.substring(1)));
        }
        return ans;
    }
}
