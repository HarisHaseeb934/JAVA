package generics;

public class Pro4 {
    static <T> void swap(T[] arr, int i , int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer arr[] = { 1,2,3,4,5,6,7,8,9,};
        String arr1[] = {"Haris", "Soban", "Mute", "Usama", "Faizan", "Faraz", "Abul-Wasay"};

        swap(arr, 1,5);
        swap(arr1, 1,5);

        for(Integer i : arr){
            System.out.println(i);
        }
        for(String i : arr1){
            System.out.println(i);
        }
    }
}
