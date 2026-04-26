package generics.stack;

public class Stack <T>{
    T arr[];
    int count = 0;
    Stack(){
        arr = (T[]) new Object[10];
    }

    void push(T value){
        if(count == 10){
            System.out.println("Stack is Full");
        }else{
            arr[count++] = value;
        }
    }

    T pop(){
        if(count < 0){
            System.out.println("Stack is UnderFlow");
            return null;
        }else{
           return arr[--count];
        }
    }

    void display(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
