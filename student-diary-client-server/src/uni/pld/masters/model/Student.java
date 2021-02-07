package uni.pld.masters.model;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private static long globalStudentId = 1;

    private Long id = globalStudentId++;
    private String facultyNumber;
    private String firstName;
    private String lastName;
    private University university;
    private Specialty specialty;
    private byte yearOfStudying;

    public Student() {
        /* Empty constructor */
    }

    public Student(String facultyNumber, String firstName, String lastName, University university, Specialty specialty) {
        this.facultyNumber = facultyNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.university = university;
        this.specialty = specialty;
        this.yearOfStudying = 1;
    }

    public Long getId() {
        return id;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public byte getYearOfStudying() {
        return yearOfStudying;
    }

    public void setYearOfStudying(byte yearOfStudying) {
        if (isYearOfStudyingValid(yearOfStudying)) {
            this.yearOfStudying = yearOfStudying;
        }
    }

    private boolean isYearOfStudyingValid(byte yearOfStudying) {
        return yearOfStudying > 0 && specialty.getYearsDuration() >= yearOfStudying;
    }

}
