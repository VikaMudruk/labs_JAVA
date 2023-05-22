package main.java.Lab5.model;

import java.util.Date;
import java.util.Objects;

public class DBStudent {

    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date dateOfBirth;
    private int studentBookNumber;

    public DBStudent(int id, String firstName, String lastName, String patronymic, Date dateOfBirth, int studentBookNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.studentBookNumber = studentBookNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DBStudent dbStudent = (DBStudent) o;
        return id == dbStudent.id && studentBookNumber == dbStudent.studentBookNumber && Objects.equals(firstName, dbStudent.firstName) && Objects.equals(lastName, dbStudent.lastName) && Objects.equals(patronymic, dbStudent.patronymic) && Objects.equals(dateOfBirth, dbStudent.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, patronymic, dateOfBirth, studentBookNumber);
    }

    @Override
    public String toString() {
        return String.format("%3s %15s %20s %20s %12s %10s", id, firstName, lastName, patronymic,
                dateOfBirth, studentBookNumber);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getStudentBookNumber() {
        return studentBookNumber;
    }

    public void setStudentBookNumber(int studentBookNumber) {
        this.studentBookNumber = studentBookNumber;
    }
}
