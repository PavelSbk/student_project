package edu.javacalearning.studentorder.domain;

public class CityRegisterCheckerResponse {

    private boolean existing;
    private Boolean temporal = true; // Boolean позволяет определить поле класса как null

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }
}

