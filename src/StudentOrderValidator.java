public class StudentOrderValidator {

    static void sendMail(StudentOrder so){
        System.out.println("Mail sending");
    }

    static StudentOrder readStudentOrder(){
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("City register is running");
        var answer = new AnswerCityRegister();
        return answer;
    }

    static AnswerWedding checkCityWedding(StudentOrder so) {
        System.out.println("Wedding check is running");
        var answer = new AnswerWedding();
        return answer;
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children register is running");
        var answer = new AnswerChildren();
        return answer;
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student check is running");
        var answer = new AnswerStudent();
        return answer;
    }

    static void checkAll(){
        StudentOrder so = readStudentOrder();
        AnswerCityRegister answerCityRegister =  checkCityRegister(so);
        AnswerChildren answerChildren = checkChildren(so);
        AnswerStudent answerStudent = checkStudent(so);
        AnswerWedding answerWedding = checkCityWedding(so);
        sendMail(so);
    }

    public static void main(String[] args) {
        checkAll();
    }
}
