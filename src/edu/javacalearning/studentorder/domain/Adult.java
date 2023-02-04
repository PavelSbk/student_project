package edu.javacalearning.studentorder.domain;

import java.time.LocalDate;

public class Adult extends Person {

    private String passportSeries;
    private String passportNumber;
    private LocalDate issueDate;
    private String issueDepartment;

    public Adult() {
    }

    public Adult(String surname, String name, String patronymic, LocalDate dateOfBirth) {
        super(surname, name, patronymic, dateOfBirth);
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
