package collection.list.vectorStack;

import java.util.LinkedList;

public class LLAsStack {
    static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addLast("Java");
        ll.addLast("Javascript");
        ll.addLast("Python");
        ll.addLast("C++");
        ll.addLast("C#");
        ll.addLast("Ruby");
        ll.addLast("HolyC");

        System.out.println(ll);

        ll.removeLast();

        System.out.println(ll.getLast());
    }
}
