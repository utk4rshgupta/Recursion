package arrays;


import java.util.Arrays;

//Input : A = {1, 2, 3, 4, 5}
//Output : [48]
//        [20, 28]
//        [8, 12, 16]
//        [3, 5, 7, 9]
//        [1, 2, 3, 4, 5]
public class SumTriangle {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        triangle(arr);
    }

    static void triangle(int[] arr){
        if(arr.length==0){
            return;
        }
        int[] arr1 = new int[arr.length - 1];
        for (int i =0;i<arr1.length;i++){
            arr1[i] = arr[i] +arr[i+1];
        }

        System.out.println(Arrays.toString(arr));
        triangle(arr1);
    }
}
