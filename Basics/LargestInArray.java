package Basics;

public class LargestInArray {
    static int largest(int[] a){
        int large = 0;
        for(int i = 0; i <= a.length - 1; i++){
            if(a[i] > large){
                large = a[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,10,6,7,8};
        System.out.println(largest(arr));
    }
}
