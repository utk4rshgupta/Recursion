package arrays;

import java.util.ArrayList;

public class findAll {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,44,2};
        int target=2;
        findAllOcc(arr,2,0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static int findAllOcc(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllOcc(arr,target,index+1);
    }
}
