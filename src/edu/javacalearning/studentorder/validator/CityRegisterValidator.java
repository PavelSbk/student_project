package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.AnswerCityRegister;
import edu.javacalearning.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("City register is running with: "
                + hostName + ", " + login + ", " + password);
        var answer = new AnswerCityRegister();
        return answer;
    }
}
