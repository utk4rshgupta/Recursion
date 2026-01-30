package SubsetsSubstrings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class diceCombination {
public static void main(String[] args) {
    //dice("",4);
//    ArrayList<String> ans = diceList("",4);
//    System.out.println(ans);
    System.out.println(diceNFace("",5,7));
}

    static void dice(String p , int target){
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for(int i =1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> diceList(String p , int target){
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i =1;i<=6 && i<=target;i++){
            list.addAll(diceList(p+i,target-i));
        }
        return list;
    }

    static ArrayList<String> diceNFace(String p , int target,int face){
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i =1;i<= face && i<=target;i++){
            list.addAll(diceNFace(p+i,target-i,face));
        }
        return list;
    }
}
