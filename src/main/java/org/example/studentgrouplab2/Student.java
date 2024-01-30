package org.example.studentgrouplab2;

import javafx.beans.property.*;

import java.util.Date;

public class Student {
    private final IntegerProperty studentID;
    private final StringProperty studentFirstName;
    private final StringProperty studentLastName;
    private final IntegerProperty studentAge;
    private final ObjectProperty<Date> enrollmentDate;
    private final StringProperty majorName;

    public Student(int studentID, String studentFirstName, String studentLastName, int studentAge, Date enrollmentDate, String majorName) {
        this.studentID = new SimpleIntegerProperty(studentID);
        this.studentFirstName = new SimpleStringProperty(studentFirstName);
        this.studentLastName = new SimpleStringProperty(studentLastName);
        this.studentAge = new SimpleIntegerProperty(studentAge);
        this.enrollmentDate = new SimpleObjectProperty<>(enrollmentDate);
        this.majorName = new SimpleStringProperty(majorName);
    }

    public int getStudentID() {
        return studentID.get();
    }

    public IntegerProperty studentIDProperty() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID.set(studentID);
    }

    public String getStudentFirstName() {
        return studentFirstName.get();
    }

    public StringProperty studentFirstNameProperty() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName.set(studentFirstName);
    }

    public String getStudentLastName() {
        return studentLastName.get();
    }

    public StringProperty studentLastNameProperty() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName.set(studentLastName);
    }

    public int getStudentAge() {
        return studentAge.get();
    }

    public IntegerProperty studentAgeProperty() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge.set(studentAge);
    }

    public Date getEnrollmentDate() {
        return enrollmentDate.get();
    }

    public ObjectProperty<Date> enrollmentDateProperty() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate.set(enrollmentDate);
    }

    public String getMajorName() {
        return majorName.get();
    }

    public StringProperty majorNameProperty() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName.set(majorName);
    }

    @Override
    public String toString() {
        return "Student ID: " + getStudentID() + "\nStudent First Name: " + getStudentFirstName() +
                "\nStudent Last Name: " + getStudentLastName() + "\nStudent Age: " + getStudentAge() +
                "\nEnrollment Date: " + getEnrollmentDate() + "\nMajor: " + getMajorName();
    }
}
