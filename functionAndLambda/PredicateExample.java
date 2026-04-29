package functionAndLambda;

import java.util.function.Predicate;

public class PredicateExample {
    static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("isEven : " + isEven.test(10));
        System.out.println("isEven : " + isEven.test(9));

        System.out.println();

        Predicate<String> checkFirst = x -> x.toLowerCase().startsWith("j");
        Predicate<String> checkLength = x -> x.length() >= 5;

//        System.out.println(checkFirst.test("jarvis"));
        System.out.println("And Predicate Chaining : " + checkFirst.and(checkLength).test("Haris"));
        System.out.println("Or Predicate Chaining : " + checkFirst.or(checkLength).test("Haris"));

        Predicate<String> nigga = checkLength.negate();
        System.out.println("Negate : " + nigga.test("Haris"));

    }
}
