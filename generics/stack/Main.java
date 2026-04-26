package generics.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 10; i++) stack.push(i);

        for (int i = 0; i < 5; i++) System.out.println(stack.pop());

        System.out.println();

        stack.display();

    }
}
