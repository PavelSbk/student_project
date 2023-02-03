package edu.javacalearning.studentorder;

import edu.javacalearning.studentorder.domain.Adult;
import edu.javacalearning.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static StudentOrder buildStudentOrder(long id) {
        var so = new StudentOrder();
        so.setStudentOrderId(id);
        return so;
    }

    static void printStudentOrder(StudentOrder so) {

    }

    public static void main(String[] args) {
        var studentOrder = new StudentOrder();

    }
}
