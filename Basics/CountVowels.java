package Basics;

public class CountVowels {
    static int countVowels(String s){
        int vowels = 0;
       for(int i = 0 ; i <= s.length() - 1 ; i++){
           if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
               vowels++;
           }
       }
        return vowels;
    }
   public static void main(String[] args) {
    String name = "Mute";
       System.out.println(countVowels(name));
    }
}
