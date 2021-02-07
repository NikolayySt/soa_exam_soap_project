package uni.pld.masters.dataprovider;

import java.util.ArrayList;
import java.util.List;

import uni.pld.masters.model.Specialty;
import uni.pld.masters.model.Student;
import uni.pld.masters.model.University;

/**
 * 
 * Class that provides collection of {@link Student} records. Simulates data base table.
 * 
 * @author nstoilov
 *
 */
public final class StudentDataProvider {

    private static final UniversityDataProvider UNIVERSITY_DATA_PROVIDER = new UniversityDataProvider();
    private static final SpecialtyDataProvider SPECIALTY_DATA_PROVIDER = new SpecialtyDataProvider();

    private static final List<Student> STUDENTS = new ArrayList<>();

    static {
        List<University> universities = UNIVERSITY_DATA_PROVIDER.getUniversities();
        List<Specialty> specialties = SPECIALTY_DATA_PROVIDER.getSpecialties();
        
        STUDENTS.add(new Student("123456789", "Georgi", "Georgiev", universities.get(0), specialties.get(0)));
        STUDENTS.add(new Student("987654321", "Ivan", "Ivanov", universities.get(1), specialties.get(1)));
        STUDENTS.add(new Student("123443210", "Nikolay", "Nikolov", universities.get(2), specialties.get(2)));
        STUDENTS.add(new Student("432112345", "Stoqn", "Georgiev", universities.get(3), specialties.get(3)));
    }

    public List<Student> getStudents() {
        return new ArrayList<>(STUDENTS);
    }

    public long addStudent(Student student) {
        STUDENTS.add(student);

        return student.getId();
    }

}
