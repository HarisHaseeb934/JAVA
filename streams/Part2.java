package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Part2 {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,42,25,46,32,41,2,5,4,53);
        List<Integer> collect = list.stream().filter(x -> x > 10).map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> list2 = Arrays.asList(1,42,2,5,46,32,41,2,5,4,53);
        System.out.println(list.stream().distinct().sorted().toList());

        list2.stream().skip(2).limit(3).forEach(x -> System.out.println("Numbers : " + x));

        long count = list2.stream().filter(x -> x > 5).count();
        System.out.println(count);

        System.out.println(list.stream().reduce((x,y)-> x + y).get());


        System.out.println(list.stream().findAny());
        System.out.println(list.stream().findFirst());

    }
}
