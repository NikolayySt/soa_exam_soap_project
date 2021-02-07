package uni.pld.masters.service;

import java.util.Collection;

import uni.pld.masters.dataprovider.SpecialtyDataProvider;
import uni.pld.masters.model.Specialty;

public class SpecialityService {

    private final SpecialtyDataProvider specialtyDataProvider = new SpecialtyDataProvider();

    public Collection<Specialty> findSpecialities() {
        return specialtyDataProvider.getSpecialties();
    }

    public long createSpeciality(Specialty specialty) {
        return specialtyDataProvider.addSpecialty(specialty);
    }

}
