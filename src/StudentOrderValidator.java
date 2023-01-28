public class StudentOrderValidator {

    static StudentOrder readStudentOrder(){
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        var crv = new CityRegisterValidator();
        crv.hostName = "Host1";
        crv.login = "Login1";
        crv.password ="Password1";
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

    static void sendMail(StudentOrder so){
        new MailSender().sendMail(so);
    }

    static void checkAll(){
        StudentOrder so = readStudentOrder();
        AnswerCityRegister answerCityRegister = checkCityRegister(so);
        AnswerChildren answerChildren = checkChildren(so);
        AnswerStudent answerStudent = checkStudent(so);
        AnswerWedding answerWedding = checkWedding(so);
        sendMail(so);
    }

    public static void main(String[] args) {
        checkAll();
    }
}
