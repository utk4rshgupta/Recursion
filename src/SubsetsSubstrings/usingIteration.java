package SubsetsSubstrings;

import java.util.ArrayList;
import java.util.List;

public class usingIteration {

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(subset(arr));
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer =new ArrayList<>();   //create a new list
        outer.add(new ArrayList<>());   //  add an empty list

        for(int num: arr){
            int n = outer.size();  //❝ Never iterate over a list using list.size() while modifying the same list ❞
            // infite loop as the list is constantly changing
            for(int i =0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));  // get ith element of the list makes a copy of it
                internal.add(num);       // adds new element in the copy
                outer.add(internal);      // add this to the final list
            }
        }
        return outer;

    }
}
