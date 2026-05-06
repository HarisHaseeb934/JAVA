package collectorsClass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part1 {
    static void main(String[] args) {
        //Collect to List

        Stream<Integer> integerStream = Stream.of(1, 1, 3, 5, 43, 32, 53);
        List<Integer> collect = integerStream.collect(Collectors.toList());
        System.out.println("List : " + collect);

        //Collect to Set

        Stream<Integer> integerStream1 = Stream.of(1, 1, 3, 5, 43, 32, 53);
        Set<Integer> setCollect = integerStream1.collect(Collectors.toSet());
        System.out.println("Set : " + setCollect);

        // Collect to Map

        List<String> collectMap = Arrays.asList("Haris","Soban","Mute");
        System.out.println(collectMap.stream().collect(Collectors.toMap(x -> x, v -> v.length())));

        //Sum, Average, Stats ,Max & Min

        List<Integer> integerStream2 = Arrays.asList(1, 1, 3, 5, 43, 32, 53);
        System.out.println("Counting : " + integerStream2.stream().collect(Collectors.counting()));
        System.out.println("Summarizing : " + integerStream2.stream().collect(Collectors.summarizingInt(x -> x)));
        System.out.println("Average : " + integerStream2.stream().collect(Collectors.averagingInt(x -> x)));
        System.out.println("Sum : " + integerStream2.stream().collect(Collectors.summarizingInt(x -> x)));

        System.out.println("Max : " + integerStream2.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get());
        System.out.println("Min : " + integerStream2.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get());

        // Group by Length

        System.out.println(collectMap.stream().collect(Collectors.groupingBy(x -> x.length())));

        // Group Students

        List<Student> students = Arrays.asList(
                new Student(101,"Haris",3.41),
                new Student(102,"Faraz",3.99),
                new Student(103,"Faizan",3.32),
                new Student(104,"Huzefa",3.40),
                new Student(105,"Soban",3.46)
    );

        System.out.println(students.stream().collect(Collectors.groupingBy(x -> x.getMarks(), Collectors.counting())));

        // Partitioning

        System.out.println(integerStream2.stream().collect(Collectors.partitioningBy(x -> x % 2 ==0)));

        //toMap with Duplicate Keys

        List<String> fruits = Arrays.asList("Apple","Apple","Banana","Peach", "Kiwiw");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x, v -> 1, (x,y)-> x + y)));

        // Collecting and Then
        Stream<Integer> integerStream3 = Stream.of(1, 1, 3, 5, 43, 32, 53);
        integerStream3.collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
    }
}
