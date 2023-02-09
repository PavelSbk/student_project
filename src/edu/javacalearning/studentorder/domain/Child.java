package edu.javacalearning.studentorder.domain;

import java.time.LocalDate;

public class Child extends Person {

    private String certificateNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private Address address;

    public Child() {
    }

    public Child(String surname, String name, String patronymic, LocalDate dateOfBirth) {
        super(surname, name, patronymic, dateOfBirth);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
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
