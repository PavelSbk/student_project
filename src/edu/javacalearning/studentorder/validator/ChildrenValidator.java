package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.AnswerChildren;
import edu.javacalearning.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    String hostName;
    String login;
    String password;

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children register is running");
        var answer = new AnswerChildren();
        return answer;
    }
}
