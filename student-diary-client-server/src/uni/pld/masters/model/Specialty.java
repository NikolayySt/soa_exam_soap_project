package uni.pld.masters.model;

import java.io.Serializable;

public class Specialty implements Serializable {

    private static final long serialVersionUID = 1L;

    private static long globalSpecialityId = 1;

    private Long id = globalSpecialityId++;
    private String name;
    private String faculty;
    private byte yearsDuration;
    private boolean magisterDegree;

    public Specialty() {
        /* Empty constructor */
    }

    public Specialty(String name, String faculty, byte yearsDuration, boolean magisterDegree) {
        this.name = name;
        this.faculty = faculty;
        this.yearsDuration = yearsDuration;
        this.magisterDegree = magisterDegree;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public byte getYearsDuration() {
        return yearsDuration;
    }

    public void setYearsDuration(byte yearsDuration) {
        this.yearsDuration = yearsDuration;
    }

    public boolean isMagisterDegree() {
        return magisterDegree;
    }

    public void setMagisterDegree(boolean magisterDegree) {
        this.magisterDegree = magisterDegree;
    }

}
