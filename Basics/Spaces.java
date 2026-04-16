package Basics;

class Spaces {
    static int spacesCont(String s){
        int spaces = 0;
        for(int i = 0 ; i <= s.length() - 1; i++ ){
            if(s.charAt(i) == ' '){
                spaces++;
            }
        }
            return spaces;
    }
    public static void main(String[] args) {
        String sentence = "MY name is Haris";
        System.out.println(spacesCont(sentence));
    }
}
