package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.AnswerWedding;
import edu.javacalearning.studentorder.domain.StudentOrder;

public class WeddingValidator {

    String hostName;
    String login;
    String password;

    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding check is running");
        var answer = new AnswerWedding();
        return answer;
    }
}
