package edu.javacalearning.studentorder.validator;

import edu.javacalearning.studentorder.domain.*;
import edu.javacalearning.studentorder.mail.MailSender;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        var rst = new StudentOrderValidator();
        rst.cityRegisterValidator.hostName = "Host1";
        rst.cityRegisterValidator.password = "Password1";
        return rst.cityRegisterValidator.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingValidator.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenValidator.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentValidator.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }

    public void checkAll() {
        StudentOrder so = readStudentOrder();
        var answerCityRegister = checkCityRegister(so);
        var answerChildren = checkChildren(so);
        var answerStudent = checkStudent(so);
        var answerWedding = checkWedding(so);
        sendMail(so);
    }

    public static void main(String[] args) {
        var studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();
    }
}
