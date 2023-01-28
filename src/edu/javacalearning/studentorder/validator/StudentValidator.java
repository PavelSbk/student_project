package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.AnswerStudent;
import edu.javacalearning.studentorder.domain.StudentOrder;

public class StudentValidator {

    String hostName;
    String login;
    String password;

    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student check is running");
        var answer = new AnswerStudent();
        return answer;
    }
}
