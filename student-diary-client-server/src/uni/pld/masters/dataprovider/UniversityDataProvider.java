package uni.pld.masters.dataprovider;

import java.util.ArrayList;
import java.util.List;

import uni.pld.masters.model.University;

/**
 * 
 * Class that provides collection of {@link University} records. Simulates data base table.
 * 
 * @author nstoilov
 *
 */
public final class UniversityDataProvider {

    private static final List<University> UNIVERSITIES = new ArrayList<>();

    static {
        String location = "Plovdiv, Bulgaria";

        UNIVERSITIES.add(new University("Plovdiv University", location));
        UNIVERSITIES.add(new University("University of food technologies", location));
        UNIVERSITIES.add(new University("Technical university", location));
        UNIVERSITIES.add(new University("New bulgarian university", location));
    }

    public List<University> getUniversities() {
        return new ArrayList<>(UNIVERSITIES);
    }

    public long addUniversity(University university) {
        UNIVERSITIES.add(university);

        return university.getId();
    }

}
