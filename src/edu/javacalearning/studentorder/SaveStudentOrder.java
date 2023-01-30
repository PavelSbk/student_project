package edu.javacalearning.studentorder;

import edu.javacalearning.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.sethFirstName("Alex");
        so.sethLastName("Petrov");
        so.setwFirstName("Mari");
        so.setwLastName("Petrova");
    }
}
