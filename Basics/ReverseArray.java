package Basics;

class ReverseArray {
    static int[] reverse(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 -i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");


        int[] arr1 = reverse(arr);
        for(int i = 0; i <= arr1.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
