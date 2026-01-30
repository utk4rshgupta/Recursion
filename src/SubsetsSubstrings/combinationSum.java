package SubsetsSubstrings;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {



//    static List<String> ans(int[] arr, String p , int target){
//        if(target==0){
//            List<String> ans = new ArrayList<>();
//            ans.add(p);
//            return ans;
//        }
//
//
//    }
static List<List<Integer>> subset(int[] arr,int target){
    if(target==0){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(p);
    }
    List<List<Integer>> outer =new ArrayList<>();
    outer.add(new ArrayList<>());

    for(int num: arr){
        int n = outer.size();
        for(int i =0;i<n;i++){
            List<Integer> internal = new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
    }
    return outer;

}
}
