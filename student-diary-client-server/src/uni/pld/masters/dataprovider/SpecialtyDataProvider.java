package uni.pld.masters.dataprovider;

import java.util.ArrayList;
import java.util.List;

import uni.pld.masters.model.Specialty;

/**
 * 
 * Class that provides collection of {@link Specialty} records. Simulates data base table.
 * 
 * @author nstoilov
 *
 */
public final class SpecialtyDataProvider {

    private static final List<Specialty> SPECIALTIES = new ArrayList<>();

    static {
        String informaticsFaculty = "Informatics faculty";

        SPECIALTIES.add(new Specialty("Math in school", "Mathematics faculty", (byte) 5, true));
        SPECIALTIES.add(new Specialty("Infomatics in school", informaticsFaculty, (byte) 5, true));
        SPECIALTIES.add(new Specialty("Math in IT", informaticsFaculty, (byte) 4, false));
        SPECIALTIES.add(new Specialty("Informatics", informaticsFaculty, (byte) 4, false));
    }

    public List<Specialty> getSpecialties() {
        return new ArrayList<>(SPECIALTIES);
    }

    public long addSpecialty(Specialty speciatly) {
        SPECIALTIES.add(speciatly);

        return speciatly.getId();
    }

}
