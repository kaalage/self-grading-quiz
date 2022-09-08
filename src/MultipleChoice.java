import java.util.ArrayList;

public class MultipleChoice extends Question {
    private int answer;
    private ArrayList<String> answerOptions;
    public MultipleChoice(String question, int answer, ArrayList answerOptions) {
        super(question);
        this.answer = answer;
        this.answerOptions = answerOptions;
    }


}
