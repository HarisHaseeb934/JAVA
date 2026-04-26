package generics;

public class Pro2<T> {
    T[] arr;
    int index = 0;

    Pro2(){
        arr = (T[]) new Object[5];
    }

    void add(T value){
        if(index < arr.length){
            arr[index++] = value;
        }else{
            System.out.println("Storage is Full");
        }
    }

    void display(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Pro2<Integer> arr1 = new Pro2<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);
        arr1.add(60);

        arr1.display();
    }
}
