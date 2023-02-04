package edu.javacalearning.studentorder.domain;

import java.time.LocalDate;

/**
 * Основная задача класса Person - объединить в себе общие для наследников (Adult и Child) поля
 * с целью расширения их функционала,
 * а не создание экземпляров этого класса.
 * Класс Person рационально определить как abstract (нет возможности явно создать объект)
 */

public abstract class Person {

    private String surname;
    private String name;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String university;
    private String studentId;

    public Person() {
    }

    public Person(String surname, String name, String patronymic, LocalDate dateOfBirth) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
