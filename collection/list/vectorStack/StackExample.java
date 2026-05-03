package collection.list.vectorStack;

import java.util.Stack;

public class StackExample {
    static void main(String[] args) {
        Stack<Integer> stck = new Stack<>();
        for(int i = 0; i < 10; i++){
            stck.push(i);
        }
//        for(int i = 0; i < 10; i++){
//            System.out.println(stck.pop());
//        }

        System.out.println("Peek : " + stck.peek());
        System.out.println("Search : " + stck.search(3));
    }
}
