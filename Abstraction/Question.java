package Abstraction;

abstract class Question {
    String questionText;
    Question(String questionText){
        this.questionText = questionText;
    }
    abstract boolean checkAnswer(String answer);
}

class Mcq extends Question{
    String correctOption;
    Mcq(String questionText, String correctOption){
        super(questionText);
        this.correctOption = correctOption;
    }
    boolean checkAnswer(String answer){
        return correctOption.equalsIgnoreCase(answer);
    }
}

class TrueFalse extends Question{
    boolean correctAnswer;
    TrueFalse(String questionText,boolean correctAnswer){
        super(questionText);
        this.correctAnswer = correctAnswer;
    }
    boolean checkAnswer(String answer){
        return Boolean.parseBoolean(answer) == correctAnswer;
    }
}