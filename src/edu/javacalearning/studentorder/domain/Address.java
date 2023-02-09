package edu.javacalearning.studentorder.domain;

public class Address {

    private String postCode;
    private String building;
    private String extension; // корпус
    private String apartment;

    public Address(String postCode, String building, String extension, String apartment) {
        this.postCode = postCode;
        this.building = building;
        this.extension = extension;
        this.apartment = apartment;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
