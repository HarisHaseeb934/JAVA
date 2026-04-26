package generics;

public class Pro6 {
    public static <T extends Comparable<T>> T max(T a, T b){
        return (a.compareTo(b) > 0 ? a : b);
    }
    public static void main(String[] args) {
        Integer a =1 , b = 2;
        String str1 = "Haris";
        String str2 = "Soban";

        System.out.println(max(a,b));
        System.out.println(max(str1,str2));
    }
}
