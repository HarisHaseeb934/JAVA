package Basics;

import java.util.Arrays;

class Anagrams {
    public static void main(String[] args) {
        String s1 = "Silent";
        String s2 = "Haris";

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagrams");
            return;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
