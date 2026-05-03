package collection.set;

import java.util.EnumSet;

public class EnumSetExample {
    static void main(String[] args) {
        EnumSet<Day> set = EnumSet.allOf(Day.class);
        System.out.println("set : " + set);

        EnumSet<Day> set2 = EnumSet.noneOf(Day.class);
        System.out.println("set2 : " + set2);

        EnumSet<Day> set3 = EnumSet.range(Day.MON , Day.WED);
        System.out.println("set 3 : " + set3);
    }
}
