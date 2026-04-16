package Basics;

class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int largest = 0;
        int secondLargest = 0;
        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] > largest){
                 secondLargest = largest;
                 largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest " + secondLargest);
    }
}
