package edu.javacalearning.studentorder;

import edu.javacalearning.studentorder.domain.Address;
import edu.javacalearning.studentorder.domain.Adult;
import edu.javacalearning.studentorder.domain.Child;
import edu.javacalearning.studentorder.domain.StudentOrder;

import java.time.LocalDate;

public class SaveStudentOrder {

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        so.setMarriageOffice("Отдел ЗАГС");

        Address address = new Address("195000", "Zanevskiy ave", "12", "142");

        // Муж
        Adult husband = new Adult("Петров",
                "Виктор",
                "Сергеевич",
                LocalDate.of(1997, 8, 24));
        husband.setPassportSeries("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        husband.setIssueDepartment("Отделение полиции №" + id);
        husband.setStudentId("" + (100000 + id));
        husband.setAddress(address);
        // Жена
        Adult wife = new Adult("Петрова", "Вероника", "Алекссевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeries("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        wife.setIssueDepartment("Отделение полиции №" + id);
        wife.setStudentId("" + (200000 + id));
        wife.setAddress(address);
        husband.setStudentId("" + (200000 + id));
        // Ребенок
        Child child1 = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child1.setCertificateNumber("" + (300000 + id));
        child1.setIssueDate(LocalDate.of(2018, 6, 11));
        child1.setIssueDepartment("Отделение полиции №" + id);
        child1.setAddress(address);
        // Ребенок
        Child child2 = new Child("Петров", "Евгений", "Викторович", LocalDate.of(2018, 6, 29));
        child2.setCertificateNumber("" + (400000 + id));
        child2.setIssueDate(LocalDate.of(2018, 7, 19));
        child2.setIssueDepartment("Отделение полиции №" + id);
        child2.setAddress(address);

        so.setHusband(husband);
        so.setWife(wife);
        so.setChild(child1);
        so.setChild(child2);

        return so;
    }

    static void printStudentOrder(StudentOrder so) {

    }

    public static void main(String[] args) {
        var studentOrder = new StudentOrder();
    }
}
