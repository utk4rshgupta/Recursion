package arrays;

import java.util.ArrayList;

public class findAll {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,44,2};
        int target=2;
        findAllOcc(arr,target,0);
        System.out.println(list);
        System.out.println(findAllOcc1(arr,2,0,new ArrayList<>()));

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

    static ArrayList<Integer> findAllOcc1(int[] arr,int target,int index,ArrayList<Integer> list2){
        if(index == arr.length){
            return list2;
        }
        if(arr[index] == target){
            list2.add(index);
        }
        return findAllOcc1(arr,target,index+1,list2);
    }
}
