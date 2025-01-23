package com.example.webService.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

    private String firstName;

    private String lastNameStudent;

    // Getters and setters
    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }

    // Constructors
    public Student(String firstName, String lastNameStudent) {
        this.firstName = firstName;
        this.lastNameStudent = lastNameStudent;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", firstNameStudent='" + firstName + '\'' +
                ", lastNameStudent='" + lastNameStudent + '\'' +
                '}';
    }
}
