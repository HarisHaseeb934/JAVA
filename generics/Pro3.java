package generics;

public class Pro3 {
    static <T> void printArr(T[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 1,2,3,4,5,6,7,8,9,};
        String arr1[] = {"Haris", "Soban", "Mute", "Usama", "Faizan", "Faraz", "Abul-Wasay"};

        printArr(arr);
        printArr(arr1);
    }
}
