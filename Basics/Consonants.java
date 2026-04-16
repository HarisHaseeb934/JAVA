package Basics;

class Consonants {
    static int consonantsCount(String s){
        int vowels = 0;
        for(int i = 0 ; i <= s.length() - 1 ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowels++;
            }
        }
        int consonants = s.length() - vowels;
        return consonants;
    }
    public static void main(String[] args) {
        String name = "Haris";
        System.out.println(consonantsCount(name));
    }
}
