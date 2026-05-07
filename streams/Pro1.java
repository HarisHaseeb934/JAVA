package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pro1 {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,8,4,5);
        list.stream().forEach(x -> System.out.println("List Element : " + x));

        Set<Integer> set = new HashSet<>(list);
        set.stream().forEach(x -> System.out.println("Set Element : " + x));

        int arr[] = {1,2,35,64,75,53};
        IntStream streamArr = Arrays.stream(arr);
        streamArr.filter(x -> x%2 == 0).forEach(x -> System.out.println("Even Element : " + x));

        List<String> str = Arrays.asList("Haris","Soban","Mute");
        str.stream().map(x -> x.toUpperCase()).forEach(x->System.out.println("Uppercase Element : " + x));
        str.stream().map(x -> x.length()).forEach(x->System.out.println("Uppercase Element : " + x));


    }
}
