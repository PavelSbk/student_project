package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.AnswerCityRegister;
import edu.javacalearning.studentorder.domain.StudentOrder;
import edu.javacalearning.studentorder.exception.CityRegisterException;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    public String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            var hAnswer = personChecker.checkPerson(so.getHusband());
            var wAnswer = personChecker.checkPerson(so.getWife());
            var cAnswer = personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace();
        }
        return new AnswerCityRegister();
    }
}
