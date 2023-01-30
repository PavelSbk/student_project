package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.*;
import edu.javacalearning.studentorder.mail.MailSender;
import edu.javacalearning.studentorder.validator.ChildrenValidator;
import edu.javacalearning.studentorder.validator.CityRegisterValidator;
import edu.javacalearning.studentorder.validator.StudentValidator;
import edu.javacalearning.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        var crv = new CityRegisterValidator();
        crv.hostName = "Host1";
        crv.password = "Password1";
        return crv.checkCityRegister(so);
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        var cwv = new WeddingValidator();
        return cwv.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        var ccv = new ChildrenValidator();
        return ccv.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        var csv = new StudentValidator();
        return csv.checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();
        var answerCityRegister = checkCityRegister(so);
        var answerChildren = checkChildren(so);
        var answerStudent = checkStudent(so);
        var answerWedding = checkWedding(so);
        sendMail(so);
    }

    public static void main(String[] args) {
        checkAll();
    }
}
