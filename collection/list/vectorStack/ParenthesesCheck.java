package collection.list.vectorStack;

import java.util.LinkedList;

public class ParenthesesCheck {
    static void main(String[] args) {
        String brackets = "(())()";
        boolean isBalanced = true;
        LinkedList<Character> list = new LinkedList<>();

        for(char c : brackets.toCharArray()){
            if(c == '('){
                list.push(c);
            }else if(c == ')'){
                if(list.isEmpty()){
                    isBalanced = false;
                    break;
                }
                list.pop();
            }
        }

        if(!list.isEmpty()){
            isBalanced = false;
        }

        System.out.println("isBalanced : " + isBalanced);
    }
}
