package Basics;

class RemoveSpaces {
    static void remove(String s){
        String sen = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }else{
                sen += s.charAt(i);
            }
        }
        System.out.println(sen);
    }
    public static void main(String[] args) {
       remove("my name is haris");
    }
}
