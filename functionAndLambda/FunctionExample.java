package functionAndLambda;

import java.util.function.Function;

public class FunctionExample {
    static void main(String[] args) {
        Function<String, Integer> strLength = x -> x.length();
        System.out.println("String Length : " + strLength.apply("Haris"));
        System.out.println("String Length : " + strLength.apply("Mute"));

        System.out.println("**************");

        Function<Integer,Integer> square = x -> x * x ;
        Function<Integer,Integer> cube = x -> x * x * x;
        System.out.println("Square : " + square.apply(10));
        System.out.println("Cube : " + cube.apply(10));

        System.out.println("Function Chaining : " + square.andThen(cube).apply(10));
    }
}
