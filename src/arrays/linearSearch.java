package arrays;

public class linearSearch {
   public static void main(String[] args) {
    int[] arr = {1,2,3,4,6,8,};
    int target = 1;
       System.out.println(find(arr,target,0));
       System.out.println(findIndex(arr,target,0));
       System.out.println(findIndexLast(arr,target,arr.length));
    }
    static boolean find(int[] arr,int target,int index){
       if(index==arr.length){
           return false;
       }
       return arr[index]==target || find(arr,target,index+1);
    }

    static int findIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }

    static int findIndexLast(int[] arr,int target,int index){
        if(index== -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,index-1);
    }

}
