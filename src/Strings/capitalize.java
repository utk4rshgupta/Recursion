package Strings;

import java.sql.SQLOutput;

public class capitalize {
    public static void main(String[] args){
//        String str = "  Hello I am Utkarsh  ";
//        StringBuilder ans = new StringBuilder("");
//        str.trim();
//        char c = str.charAt(0);
//
//        ans.append(c);
//        for(int i = 0;i<str.length()-1;i++){
//            char ch = str.charAt(i);
//            if(str.charAt(i)==' '){
//
//            }
//
//        }
//
//        String str = "iiii Utkarsh lives @ in pbh 54 ";
//        str = str.trim();
//        char[] arr = str.toCharArray();
//        for(int i = 0 ;i<arr.length;i++){
//            if(arr[i] == ' '){
//                arr[i-1] = Character.toUpperCase(arr[i-1]);
//                arr[i+1] = Character.toUpperCase(arr[i+1]);
//            }
//            arr[0] = Character.toUpperCase(arr[0]);
//            arr[arr.length-1] = Character.toUpperCase(arr[arr.length-1]);
//
//
//        }
//        String ans = new String(arr);
//
//        System.out.println(ans);
//        System.out.println(arr.toString());
//
//        for (int i = 0; i <arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        String s = "utkarsh";

        int index = 3;
        s.replace(s.charAt(index),'x');
        System.out.println(s);
    }
}
