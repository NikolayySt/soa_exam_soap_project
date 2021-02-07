package uni.pld.masters.service;

import java.util.Collection;

import uni.pld.masters.dataprovider.UniversityDataProvider;
import uni.pld.masters.model.University;

public class UniversityService {

    private final UniversityDataProvider universityDataProvider = new UniversityDataProvider();

    public Collection<University> findUniversities() {
        return universityDataProvider.getUniversities();
    }

    public long createUniversity(University university) {
        return universityDataProvider.addUniversity(university);
    }

}
