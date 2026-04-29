package functionAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiExample {
    static void main(String[] args) {
        BiPredicate<Integer,Integer> compare = (x, y) -> x >= y;
        System.out.println(compare.test(10,10));

        BinaryOperator<Integer> addTwo = (x, y) -> x + y;
        System.out.println(addTwo.apply(10,20));

        BinaryOperator<String> merger = (x, y) -> x + y;
        System.out.println(merger.apply("My name is ","Haris"));

        Thread t1 = new Thread(() -> System.out.println("Thread is Running"));
        t1.start();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5,75,4,43));
        list.sort((x,y) -> x - y);
        System.out.println(list);
    }
}
