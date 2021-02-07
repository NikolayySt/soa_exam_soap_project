package uni.pld.masters.model;

import java.io.Serializable;

public class University implements Serializable {

    private static final long serialVersionUID = 1L;

    private static long globalUniversityId = 1;

    private Long id = globalUniversityId++;
    private String name;
    private String location;

    public University() {
        /* Empty constructor */
    }

    public University(String name, String location) {
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
